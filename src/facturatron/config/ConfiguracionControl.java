/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package facturatron.config;

import facturatron.MVC.Controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author Octavio
 */
public class ConfiguracionControl extends Controller<ConfiguracionDao, ConfiguracionForm> {

    public ConfiguracionControl() {
        setModel(new ConfiguracionDao());
        setView(new ConfiguracionForm());
        init();
        getModel().load();
    }

    public void btnBuscarCertificado() {
        JFileChooser jfc = new JFileChooser();
        jfc.setFileFilter(new FileFilter() {

            @Override
            public boolean accept(File f) {
                return (f.getName().matches(".*\\.cer") || f.isDirectory());
            }

            @Override
            public String getDescription() {
                return "Certificado Digital";
            }
        });
        if(jfc.showOpenDialog(getView())==JFileChooser.APPROVE_OPTION) {
            getView().getTxtPathCer().setText(jfc.getSelectedFile().getPath());
        }
    }

    public void btnBuscarLlave() {
        JFileChooser jfc = new JFileChooser();
        jfc.setFileFilter(new FileFilter() {

            @Override
            public boolean accept(File f) {
                return (f.getName().matches(".*\\.key") || f.isDirectory());
            }

            @Override
            public String getDescription() {
                return "Certificado Digital";
            }
        });
        if(jfc.showOpenDialog(getView())==JFileChooser.APPROVE_OPTION) {
            getView().getTxtPathKey().setText(jfc.getSelectedFile().getPath());
        }
    }

    public void btnBuscarPdf(){
        JFileChooser jfc = new JFileChooser();
        jfc.setFileSelectionMode(jfc.DIRECTORIES_ONLY);
        
        jfc.setFileFilter(new FileFilter() {

            @Override
            public boolean accept(File f) {
                return (f.isDirectory());
            }

            @Override
            public String getDescription() {
                return "Carpeta de Almacenamiento";
            }
        });
        if(jfc.showOpenDialog(getView())==JFileChooser.APPROVE_OPTION) {
            getView().getTxtPathPdf().setText(jfc.getSelectedFile().getPath());
        }
    }

    public void btnBuscarPlantilla(){
        JFileChooser jfc = new JFileChooser();
        jfc.setFileFilter(new FileFilter() {

            @Override
            public boolean accept(File f) {
                return (f.getName().matches(".*\\.jasper") || f.isDirectory());
            }

            @Override
            public String getDescription() {
                return "Plantilla de Jasper";
            }
        });
        if(jfc.showOpenDialog(getView())==JFileChooser.APPROVE_OPTION) {
            getView().getTxtPathPlantilla().setText(jfc.getSelectedFile().getPath());
        }
    }

    public void btnBuscarXml(){
        JFileChooser jfc = new JFileChooser();
        jfc.setFileSelectionMode(jfc.DIRECTORIES_ONLY);
        jfc.setFileFilter(new FileFilter() {

            @Override
            public boolean accept(File f) {
                return (f.isDirectory());
            }

            @Override
            public String getDescription() {
                return "Carpeta de Almacenamiento";
            }
        });
        if(jfc.showOpenDialog(getView())==JFileChooser.APPROVE_OPTION) {
            getView().getTxtPathXml().setText(jfc.getSelectedFile().getPath());
        }
    }

    public void btnGuardar() {
        getModel().setpathCer(getView().getTxtPathCer().getText());
        getModel().setpathKey(getView().getTxtPathKey().getText());
        getModel().setpassCer(String.valueOf(getView().getTxtPassCer().getPassword()));
        getModel().setUrlBd  (getView().getTxtUrlBd().getText());
        getModel().setUserBd (getView().getTxtUserBd().getText());
        getModel().setPassBd (String.valueOf(getView().getTxtPassBd().getPassword()));
        getModel().setPathPdf(getView().getTxtPathPdf().getText());
        getModel().setPathPlantilla(getView().getTxtPathPlantilla().getText());
        getModel().setPathXml(getView().getTxtPathXml().getText());

        getModel().persist();
        JOptionPane.showMessageDialog(getView(), "Configuración actualizada");
    }

    @Override
    public void asignarEventos() {
        getView().getBtnGuardar().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                btnGuardar();
            }
        });
        getView().getBtnBuscarCer().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                btnBuscarCertificado();
            }
        });
        getView().getBtnBuscarKey().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                btnBuscarLlave();
            }
        });
        getView().getBtnBuscarPdf().addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                btnBuscarPdf();
            }
        });
        getView().getBtnBuscarPlantilla().addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                btnBuscarPlantilla();
            }
        });
        getView().getBtnBuscarXml().addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                btnBuscarXml();
            }
        });
    }

    @Override
    public void enlazarModeloVista() {
        getView().setModel(getModel());
        getModel().addObserver(getView());
    }

}