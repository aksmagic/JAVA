	String sTomcatPath =System.getenv("CATALINA_HOME");
			if(UIUtil.isNullOrEmpty(sTomcatPath))
				sTomcatPath = "C:\\DassaultSystemes\\R2019x\\3DSpace\\win_b64\\code\\tomee";
			String sFilePath = sTomcatPath+"\\temp\\report";
			String sFileName = "Report-ComponentSubstitute.xlsx";
			File file = new File(sFilePath);
			if (!file.exists())
				file.mkdir();
			sOutputFile = sFilePath+"\\"+sFileName;
