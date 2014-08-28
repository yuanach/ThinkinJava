package com.yuanach.ws;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.MarshalBase64;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;
import org.xmlpull.v1.XmlPullParserException;

public class MobileWS {
	;
	private static final String serviceNameSpace="http://WebXml.com.cn/";
	private static String serviceUrl="http://www.webxml.com.cn/webservices/weatherwebservice.asmx";
	private static final String getSupportCity="getSupportCity";
	 private static final String getWeatherbyCityName="getWeatherbyCityName";
	 private static final String getSupportProvince="getSupportProvince";
	;
	public static void main(String[] args) throws IOException {
		MobileWS ws=new MobileWS();
		String province;
		List<String> cities=new ArrayList<String>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the name of Province:");
		while(!(province = br.readLine()).equals("quit")){
			cities=ws.getSupportCity(province);		
			for(int i=0;i<cities.size();i++){
				System.out.println(cities.get(i));
			}
		}
		System.out.println("Exited.");
	}
	
	public List<String> getSupportCity(String province){
		
		List<String> cities=new ArrayList<String>();
		
		SoapObject request=new SoapObject(serviceNameSpace,getSupportCity);
		request.addProperty("byProvinceName", province);
		SoapSerializationEnvelope envelope=new SoapSerializationEnvelope(SoapEnvelope.VER11);
		envelope.dotNet=true;
		envelope.bodyOut=request;		
		(new MarshalBase64()).register(envelope);
		
		HttpTransportSE ht=new HttpTransportSE(serviceUrl);
		ht.debug=true;
		try {
			ht.call(serviceNameSpace+getSupportCity,envelope);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (XmlPullParserException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try{
			SoapObject result=(SoapObject)envelope.getResponse();
			int count=result.getPropertyCount();
			for(int i=0;i<count;i++){
				cities.add(result.getProperty(i).toString());
			}
		}catch(Exception e){
			System.out.println(e);
		}
		return cities;
	}

}
