package grmr;
import java.io.*;

import org.antlr.Tool;

import utils.ResourceUtils;

public class Main {

private static	String grammerfileName = ResourceUtils.getGrammarPath()+"TPPModel.g";
    public static void main(String args[]) throws Exception {
    	  Tool antlr = new Tool(new String[]{grammerfileName});
    	  antlr.setOutputDirectory("src/grmr");
    	  antlr.setForceAllFilesToOutputDir(true);
    	  antlr.process();
    	  }
}
