package com.controllers;

	import java.awt.Desktop;
	import java.io.File;
	import java.io.IOException;
	import java.util.List;
	import java.util.logging.Level;
	import java.util.logging.Logger;

import javax.swing.JOptionPane;

import javafx.application.Application;
	import javafx.event.ActionEvent;
	import javafx.event.EventHandler;
	import javafx.geometry.Insets;
	import javafx.scene.Scene;
	import javafx.scene.control.Button;
	import javafx.scene.layout.GridPane;
	import javafx.scene.layout.Pane;
	import javafx.scene.layout.VBox;
	import javafx.stage.FileChooser;
	import javafx.stage.Stage;
	
	 
	public final class ContrInOutput_Open extends Application {
	 
	   // private Desktop desktop = Desktop.getDesktop();
	 
	    @Override
	    public void start(final Stage stage) {
	        stage.setTitle("File Chooser");
	 
	        final FileChooser fileChooser = new FileChooser();	              		        
	               configureFileChooser(fileChooser);
	               File file = fileChooser.showOpenDialog(stage);
	               System.out.println(fileChooser.getInitialDirectory());
	                    
	               if (file != null) {
	                        openFile(file);
	               }        	        
	    }
	 
	    public static void main(String[] args) {
	        Application.launch(args);
	    }
	 
	    private static void configureFileChooser(
	    		
	        final FileChooser fileChooser) {  
	    	
	            fileChooser.setTitle("Open file");
	            fileChooser.setInitialDirectory(
	                new File(System.getProperty("user.home"))
	            );                 
	            fileChooser.getExtensionFilters().addAll(
	                new FileChooser.ExtensionFilter("All files", "*.*"),
	                //new FileChooser.ExtensionFilter("JPG", "*.jpg"),
	                new FileChooser.ExtensionFilter("TEXT", "*.txt")
	             );  	           	            
	    }
	 
	    private void openFile(File file) {
	        	  System.out.println("File Opened:"+file);  	
/*	    	try {
	            //.open(file);	    		
	        } catch (IOException ex) {	        	
	        	ex.printStackTrace();
	        	 JOptionPane.showMessageDialog(null, "IOException: " + ex.getMessage(),"Error", JOptionPane.ERROR_MESSAGE);	        	 
	            Logger.getLogger(ContrInOutput_Open.class.getName()).log(Level.SEVERE, null, ex);
	        }*/
	    }
	
}
