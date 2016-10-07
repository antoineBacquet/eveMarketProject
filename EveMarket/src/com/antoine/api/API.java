package com.antoine.api;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.apache.commons.io.IOUtils;

public class API {

	// https://api.eveonline.com/account/AccountStatus.xml.aspx?keyID=5485028&vCode=dk2M0mFPdnT5dXVaSvJzhqFcN1LRrPLJN22Ne7GrzdhRHzM2YmJR7WUcLXAVmtls

	private static final String API_INFO_LINK = "https://api.eveonline.com/account/APIKeyInfo.xml.aspx";

	private String keyId = "";

	private String verifCode = "";

	public API(String keyId, String verifCode) {
		this.keyId = keyId;
		this.verifCode = verifCode;

	}

	public void getData() {

	}

	public static void main(String[] args) {

		URL url;
		try {
			url = new URL("https://api.eveonline.com/eve/CharacterInfo.xml.aspx");
			HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
			urlConnection.addRequestProperty("User-Agent", "Foo?");
			
			final InputStream inputStream = urlConnection.getInputStream();
	        final String html = IOUtils.toString(inputStream);
	        inputStream.close();
			
		} catch (Exception e) {

			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
