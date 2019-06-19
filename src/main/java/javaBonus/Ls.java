package javaBonus;

import java.io.File;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;

public class Ls {
	
	boolean all;
	boolean Size;
	boolean reverse;
	boolean list;
	boolean help;
	boolean time;
	String path = "jinjinjava";
	
	public void run(String[] args) {
		
		Options options = createOptions();
		String line = "";
		String[] lines = null;
		if(parseOptions(options, args)) {
			
			if(help) {
				printHelp(options);
				return;
			}
			if(list) {
				File dir = new File(path);
				File[] fileList = dir.listFiles();
				lines = new String[fileList.length];
				
				File[] rev = new File[fileList.length];
				File[] al = new File[fileList.length];

				int k = 0;
				if(reverse) {
					for(int j = fileList.length - 1; j >= 0; j--) {
						File file1 = fileList[j];
						rev[k] = file1;
						k++;
					}
					fileList = rev;
				}

				k = 0;
				if (!all) {
					for (int i = 0; i < fileList.length; i++) {
						if (fileList[i].getName().startsWith(".")) {
							continue;
						} else {
							al[k] = fileList[i];
							k++;
						}
					}
					fileList = al;
				}
				
				int i = 0;
				for (File file : fileList) {

					if (file == null || file.getName().equals("null")) {
						continue;
					}
					line = file.getName();

					if(time) {
						long lTime = file.lastModified();
						String pattern = "yyyy-MM-dd (a) HH:mm:ss";
						SimpleDateFormat formatter = new SimpleDateFormat(pattern);
						String date = (String)formatter.format(new Timestamp(lTime));
						line = date + "\t" + line;
					}
					
					if (Size) {
						if (file.length() < 1024) {
//							System.out.println("\t" + file.length() + "B");//size	
							line = file.length() + "B" + "\t" + line;
						} else if (file.length() < 1048576) {
//							System.out.println("\t" + file.length()/1024 + "KB");//size		
							line = file.length() / 1024 + "KB" + "\t" + line;
						} else if (file.length() < 1073741824) {
//							System.out.println("\t" + file.length()/1048576 + "MB");//size		
							line = file.length() / 1048576 + "MB" + "\t" + line;
						} else {
//							System.out.println("\t" + file.length()/1073741824 + "GB");//size
							line = file.length()/1073741824 + "GB" + "\t" + line;
						}
					}
					lines[i] = line;
					i++;
				}
			}
			
			for (String rline : lines) {
				if(rline == null || rline.equals("null")) {
					continue;
				}
				System.out.println(rline);
			}
		}
	}
	
	private boolean parseOptions(Options options, String[] args) {
		CommandLineParser parser = new DefaultParser();

		try {

			CommandLine cmd = parser.parse(options, args);

			all = cmd.hasOption("a");
			Size = cmd.hasOption("S");
			reverse = cmd.hasOption("r");
			list = cmd.hasOption("ls");
			time = cmd.hasOption("t");
			help = cmd.hasOption("h");
			
		} catch (Exception e) {
			printHelp(options);
			return false;
		}

		return true;
	}
	
	private Options createOptions() {
		Options options = new Options();
		
		// add options by using OptionBuilder
		options.addOption(Option.builder("a").longOpt("all")
				.desc("Lists all files in the given directory, including hidden files")
//				.hasArg()
				.argName("All files")
//				.required()
				.build());

		// add options by using OptionBuilder
		options.addOption(Option.builder("S").longOpt("Size")
				.desc("Sort the list of files by the file size")
//				.hasArg()
				.argName("Sorted files")
//				.required()
				.build());
		
		// add options by using OptionBuilder
		options.addOption(Option.builder("r").longOpt("reverse")
				.desc("Reverse sort the list of files")
//				.hasArg()
				.argName("Reverse sort")
//				.required()
				.build());
		
		// add options by using OptionBuilder
		options.addOption(Option.builder("ls").longOpt("lists")
				.desc("list of files")
//				.hasArg()
				.argName("File list")
//				.required()
				.build());
		
		// add options by using OptionBuilder
		options.addOption(Option.builder("t").longOpt("time")
				.desc("last modified time of the files")
//				.hasArg()
				.argName("Last modified time")
//				.required()
				.build());
		
		// add options by using OptionBuilder
		options.addOption(Option.builder("h").longOpt("help")
				.desc("Show a Help page")
				.argName("Help")
				.build());
		
		return options;
	}
	
	private void printHelp(Options options) {
		// automatically generate the help statement
		HelpFormatter formatter = new HelpFormatter();
		String header = "~~~~ls~~~~";
		String footer ="~~~~@06,2019~~~~";
		formatter.printHelp("ls", header, options, footer, true);
	}
}
