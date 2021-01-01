package com.uvsoftgroup.bp.uvsoftgroupjavabp.clobmeco;

import com.uvsoftgroup.bp.uvsoftgroupjavabp.collectionsexm.BuildingInfo;
/**
 * City area plotInfo registration info
 * @author xx
 *
 */
public class PlotInfo {
	long id;
	long addressId, plId;
	String code, name, useType, remark;
	// Aggregation 
	BuildingInfo buildingInfo;

	// Constructors
	public PlotInfo() {
		super();
	}

	public PlotInfo(long id, long addressId) {
		// reusing constructor
		this();
		this.id = id;
		this.addressId = addressId;

	}

	public PlotInfo(long id, long addressId, long plId, String code) {
		// reusing constructor
		this(id, addressId);
		this.plId = plId;
		this.code = code;
	    // this(id, addressId);//C.T.Error
	}

	public PlotInfo(long id, String code, String name, String useType) {
		super();
		this.id = id;
		this.code = code;
		this.name = name;
		this.useType = useType;
	}
	
	public PlotInfo(long id, long addressId, long plId, String code, String name, String useType, String remark,
			BuildingInfo buildingInfo) {
		super();
		this.id = id;
		this.addressId = addressId;
		this.plId = plId;
		this.code = code;
		this.name = name;
		this.useType = useType;
		this.remark = remark;
		this.buildingInfo = buildingInfo;
	}

	// Constructor copy for other class instance object
	public PlotInfo(PlotInfo c) {
		this(c.id, c.addressId);
	}

	public PlotInfo(BuildingInfo buildingInfo) {
		super();
		this.buildingInfo = buildingInfo;
	}

	public void insert(long id, long addressId, long plId, String code, String name, String useType, String remark){  
		this.id=id;  
		this.addressId=addressId;  
		this.plId=plId;  
		this.code=code;
		this.name=name;
		this.useType=useType;
		this.remark=remark;
		}  
	
	// methods input parameters or arguments l,w
	public double areaCalculation(double l, double w) {
		double areaCal=l*w;
		return areaCal;
	}

	/** calculation of volume
	 *  methods input parameters or arguments l,w,h
	 * 
	 */
	public double volumnCalculation(double l, double w, double h) {
		double volumn= this.areaCalculation(l, w) * h;
		return  volumn;
	}
	
	public String getUseType(PlotInfo plotInfo) {
		if (plotInfo!=null){
			if(plotInfo.useType!=null){
				return plotInfo.useType;
			}
			else{
				return null;	
			}
		}
		return null;
	}
	
	public double getPriceByUseType(PlotInfo plotInfo, BuildingInfo buildingInfo) {
		String type=getUseType(plotInfo);
		if (type!=null){
			if(type.equalsIgnoreCase("R")){
				return  buildingInfo.getBuLength() * buildingInfo.getBuWide() *10.00;
			}
			else if(type.equalsIgnoreCase("C")){
				return  buildingInfo.getBuLength() * buildingInfo.getBuWide() *20.00;
			}
			
			else if(type.equalsIgnoreCase("I")){
				return  buildingInfo.getBuLength() * buildingInfo.getBuWide() *30.00;
			}
			
			else if(type.equalsIgnoreCase("M")){
				return  buildingInfo.getBuLength() * buildingInfo.getBuWide() *40.00;
			}
			
			else{
				return 0.0;	
			}
		}
		return 0.0;
	}
	

	/**
	 *  value will be set from the class constructor from BuildingInfo
	 * @return double
	 */

	public double buildingAreaCalculation() {
		if (buildingInfo != null) {
			if (buildingInfo.getBuLength() >= 0 && buildingInfo.getBuWide() >= 0) {
				return buildingInfo.getBuLength() * buildingInfo.getBuWide();
			} else {
				return 0.0;
			}
		} else {
			return 0.0;
		}
	}

	// value will be set from the class BuildingInfo instance object
	public double buildingAreaCalculation(BuildingInfo buildingInfo) {
		if (buildingInfo != null) {
			if (buildingInfo.getBuLength() >= 0 && buildingInfo.getBuWide() >= 0) {
				return buildingInfo.getBuLength() * buildingInfo.getBuWide();
			} else {
				return 0.0;
			}
		} else {
			return 0.0;
		}
	}

	
	
	
	public String getUseType() {
		return useType;
	}

	public void setUseType(String useType) {
		this.useType = useType;
	}

	@Override
	public String toString() {
		return "PlotInfo [id=" + id + ", addressId=" + addressId + ", plId=" + plId
				+ ", code=" + code + ", name=" + name + ", useType=" + useType + ", remark=" + remark
				+ ", buildingInfo=" + buildingInfo + "]";
	}


}
