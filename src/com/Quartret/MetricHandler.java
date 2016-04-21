/**
 * MetricHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.Quartret;

public interface MetricHandler extends java.rmi.Remote {
    public java.lang.String setMetrics(java.lang.String name, int value) throws java.rmi.RemoteException;
    public java.lang.String getMetric(java.lang.String dateTime) throws java.rmi.RemoteException;
    public java.lang.String getAggregateMetric(java.lang.String startTime, java.lang.String endTime) throws java.rmi.RemoteException;
}
