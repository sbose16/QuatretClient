/**
 * MetricHandlerServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.Quartret;

public class MetricHandlerServiceLocator extends org.apache.axis.client.Service implements com.Quartret.MetricHandlerService {

    public MetricHandlerServiceLocator() {
    }


    public MetricHandlerServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public MetricHandlerServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for MetricHandler
    private java.lang.String MetricHandler_address = "http://localhost:8080/QuartetHealth/services/MetricHandler";

    public java.lang.String getMetricHandlerAddress() {
        return MetricHandler_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String MetricHandlerWSDDServiceName = "MetricHandler";

    public java.lang.String getMetricHandlerWSDDServiceName() {
        return MetricHandlerWSDDServiceName;
    }

    public void setMetricHandlerWSDDServiceName(java.lang.String name) {
        MetricHandlerWSDDServiceName = name;
    }

    public com.Quartret.MetricHandler getMetricHandler() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(MetricHandler_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getMetricHandler(endpoint);
    }

    public com.Quartret.MetricHandler getMetricHandler(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.Quartret.MetricHandlerSoapBindingStub _stub = new com.Quartret.MetricHandlerSoapBindingStub(portAddress, this);
            _stub.setPortName(getMetricHandlerWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setMetricHandlerEndpointAddress(java.lang.String address) {
        MetricHandler_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.Quartret.MetricHandler.class.isAssignableFrom(serviceEndpointInterface)) {
                com.Quartret.MetricHandlerSoapBindingStub _stub = new com.Quartret.MetricHandlerSoapBindingStub(new java.net.URL(MetricHandler_address), this);
                _stub.setPortName(getMetricHandlerWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("MetricHandler".equals(inputPortName)) {
            return getMetricHandler();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://Quartret.com", "MetricHandlerService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://Quartret.com", "MetricHandler"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("MetricHandler".equals(portName)) {
            setMetricHandlerEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
