package com.pengdaijun.odata.olingo.jpa.processor;

import org.apache.olingo.odata2.annotation.processor.api.AnnotationServiceFactory;
import org.apache.olingo.odata2.api.ODataService;
import org.apache.olingo.odata2.api.ODataServiceFactory;
import org.apache.olingo.odata2.api.exception.ODataApplicationException;
import org.apache.olingo.odata2.api.exception.ODataException;
import org.apache.olingo.odata2.api.processor.ODataContext;

public class AnnotationSampleServiceFactory extends ODataServiceFactory {
	/**
	   * Instance holder for all annotation relevant instances which should be used as singleton
	   * instances within the ODataApplication (ODataService)
	   */
	  private static class AnnotationInstances {
	    final static String MODEL_PACKAGE = "org.apache.olingo.sample.annotation.model";
	    final static ODataService ANNOTATION_ODATA_SERVICE;

	    static {
	      try {
	        ANNOTATION_ODATA_SERVICE = AnnotationServiceFactory.createAnnotationService(MODEL_PACKAGE);
	      } catch (ODataApplicationException ex) {
	        throw new RuntimeException("Exception during sample data generation.", ex);
	      } catch (ODataException ex) {
	        throw new RuntimeException("Exception during data source initialization generation.", ex);
	      }
	    }
	  }

	  public ODataService createService(final ODataContext context) throws ODataException {
	    return AnnotationInstances.ANNOTATION_ODATA_SERVICE;
	  }
	}