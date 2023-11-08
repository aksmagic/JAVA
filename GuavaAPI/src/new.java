	String sTomcatPath =System.getenv("CATALINA_HOME");
			if(UIUtil.isNullOrEmpty(sTomcatPath))
				sTomcatPath = "C:\\DassaultSystemes\\R2019x\\3DSpace\\win_b64\\code\\tomee";
			String sFilePath = sTomcatPath+"\\temp\\report";
			String sFileName = "Report-ComponentSubstitute.xlsx";
			File file = new File(sFilePath);
			if (!file.exists())
				file.mkdir();
			sOutputFile = sFilePath+"\\"+sFileName;

----
	e  25: 	BufferedWriter bwWriter = null;
	Line  41: 		bwWriter       = new BufferedWriter( new FileWriter(sDumpFileName, true));	 //Opening Dump file in APPEND mode
	Line  63: 			bwWriter.write(sbDumpHearder.toString()+"\n");
	Line  70: 					bwWriter.write(sRowData+"\t");
	Line  72: 				bwWriter.write("\n");     //moving to New line
	Line  85: 				if (bwWriter != null) {
	Line  86: 					bwWriter.close();
