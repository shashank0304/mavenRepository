package com.ssangu.jaxb;

import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.example.patient.Patient;

public class JAXBDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(Patient.class);
			Marshaller	marshaller = jaxbContext.createMarshaller();
			
			Patient patient = new Patient();
			patient.setId(12345);
			patient.setPatientName("John Miller");
			
			StringWriter writer = new StringWriter();
			marshaller.marshal(patient, writer);
			System.out.println(writer.toString());
			
			//Unmarshal
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
			Patient patientResult = (Patient)unmarshaller.unmarshal(new StringReader(writer.toString()));
			
			System.out.println(patientResult.getPatientName());
			

		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
