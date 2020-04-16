package com.jse.phone;

public class PhoneServiceImpl implements PhoneService{
	private Phone[] phones;
	private int count;
	private CelPhone[] celPhones;
	private Iphone[] iphones;
	private GalaxyNote[] galaxyNotes;
	
	public PhoneServiceImpl() {
		phones = new Phone[3];
		celPhones = new CelPhone[3];
		iphones = new Iphone[3];
		galaxyNotes = new GalaxyNote[3];
		count = 0;
	}

	@Override
	public void add(Phone phone) {
		phones[count] = phone;
		count++;
	}
	@Override
	public void add(CelPhone phone) {
		celPhones[count] = phone;
		count++;
		
	}

	@Override
	public void add(Iphone phone) {
		iphones[count] = phone;
		count++;
		
	}

	@Override
	public void add(GalaxyNote phone) {
		galaxyNotes[count] = phone;
		count++;
		
	}
	@Override
	public Phone[] phonelist() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CelPhone[] celPhonelist() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Iphone[] iPhonelist() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GalaxyNote[] galaxyNotelist() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Phone detail(Phone phone) {
		return null;
	}
	@Override
	public CelPhone detail(CelPhone phone) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Iphone detail(Iphone phone) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GalaxyNote detail(GalaxyNote phone) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int count() {
		return count;
	}

	@Override
	public void update(Phone phone) {
		
	}

	@Override
	public void delete(Phone phone) {
		
	}	
}
