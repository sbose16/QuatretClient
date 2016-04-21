package com.Quartret;

public class MetricHandlerProxy implements com.Quartret.MetricHandler {
  private String _endpoint = null;
  private com.Quartret.MetricHandler metricHandler = null;
  
  public MetricHandlerProxy() {
    _initMetricHandlerProxy();
  }
  
  public MetricHandlerProxy(String endpoint) {
    _endpoint = endpoint;
    _initMetricHandlerProxy();
  }
  
  private void _initMetricHandlerProxy() {
    try {
      metricHandler = (new com.Quartret.MetricHandlerServiceLocator()).getMetricHandler();
      if (metricHandler != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)metricHandler)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)metricHandler)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (metricHandler != null)
      ((javax.xml.rpc.Stub)metricHandler)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.Quartret.MetricHandler getMetricHandler() {
    if (metricHandler == null)
      _initMetricHandlerProxy();
    return metricHandler;
  }
  
  public java.lang.String setMetrics(java.lang.String name, int value) throws java.rmi.RemoteException{
    if (metricHandler == null)
      _initMetricHandlerProxy();
    return metricHandler.setMetrics(name, value);
  }
  
  public java.lang.String getMetric(java.lang.String dateTime) throws java.rmi.RemoteException{
    if (metricHandler == null)
      _initMetricHandlerProxy();
    return metricHandler.getMetric(dateTime);
  }
  
  public java.lang.String getAggregateMetric(java.lang.String startTime, java.lang.String endTime) throws java.rmi.RemoteException{
    if (metricHandler == null)
      _initMetricHandlerProxy();
    return metricHandler.getAggregateMetric(startTime, endTime);
  }
  
  
}