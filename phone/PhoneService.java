package com.jse.phone;

public interface PhoneService {
	public void add(Phone phone);
	public void add(CelPhone phone);
	public void add(Iphone phone);
	public void add(GalaxyNote phone);
	public Phone[] phonelist();
	public CelPhone[] celPhonelist();
	public Iphone[] iPhonelist();
	public GalaxyNote[] galaxyNotelist();	
	public Phone detail(Phone phone);
	public CelPhone detail(CelPhone phone);
	public Iphone detail(Iphone phone);
	public GalaxyNote detail(GalaxyNote phone);
	public int count();
	public void update(Phone phone);
	public void delete(Phone phone);
}
