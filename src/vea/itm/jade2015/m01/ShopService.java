package vea.itm.jade2015.m01;

public interface ShopService<T> {

	public ServiceFactory<T> getServiceFactory(String serviceFactory);
}
