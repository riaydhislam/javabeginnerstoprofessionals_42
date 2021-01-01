package com.uvsoftgroup.bp.uvsoftgroupjavabp.collectionsexm;

import java.util.Arrays;

public class PlotInfo {
	long plId;
	long plAddressId;
	String plCode, plName, plType, plNumber, plMonzaNumber, plCSNumber, plMSNumber, plRemark;
	double plTotalArea, plTotalBuildingCoverArea, plNumberOfBuilding, plHeightFromMSL, plCenterLongitude,
			plCenterLatitude;
	byte[] plLayoutPicture, utilityLocationMap;
	double plPrice;
	
	
	
	
	public long getPlId() {
		return plId;
	}
	public void setPlId(long plId) {
		this.plId = plId;
	}
	public long getPlAddressId() {
		return plAddressId;
	}
	public void setPlAddressId(long plAddressId) {
		this.plAddressId = plAddressId;
	}
	public String getPlCode() {
		return plCode;
	}
	public void setPlCode(String plCode) {
		this.plCode = plCode;
	}
	public String getPlName() {
		return plName;
	}
	public void setPlName(String plName) {
		this.plName = plName;
	}
	public String getPlType() {
		return plType;
	}
	public void setPlType(String plType) {
		this.plType = plType;
	}
	public String getPlNumber() {
		return plNumber;
	}
	public void setPlNumber(String plNumber) {
		this.plNumber = plNumber;
	}
	public String getPlMonzaNumber() {
		return plMonzaNumber;
	}
	public void setPlMonzaNumber(String plMonzaNumber) {
		this.plMonzaNumber = plMonzaNumber;
	}
	public String getPlCSNumber() {
		return plCSNumber;
	}
	public void setPlCSNumber(String plCSNumber) {
		this.plCSNumber = plCSNumber;
	}
	public String getPlMSNumber() {
		return plMSNumber;
	}
	public void setPlMSNumber(String plMSNumber) {
		this.plMSNumber = plMSNumber;
	}
	public String getPlRemark() {
		return plRemark;
	}
	public void setPlRemark(String plRemark) {
		this.plRemark = plRemark;
	}
	public double getPlTotalArea() {
		return plTotalArea;
	}
	public void setPlTotalArea(double plTotalArea) {
		this.plTotalArea = plTotalArea;
	}
	public double getPlTotalBuildingCoverArea() {
		return plTotalBuildingCoverArea;
	}
	public void setPlTotalBuildingCoverArea(double plTotalBuildingCoverArea) {
		this.plTotalBuildingCoverArea = plTotalBuildingCoverArea;
	}
	public double getPlNumberOfBuilding() {
		return plNumberOfBuilding;
	}
	public void setPlNumberOfBuilding(double plNumberOfBuilding) {
		this.plNumberOfBuilding = plNumberOfBuilding;
	}
	public double getPlHeightFromMSL() {
		return plHeightFromMSL;
	}
	public void setPlHeightFromMSL(double plHeightFromMSL) {
		this.plHeightFromMSL = plHeightFromMSL;
	}
	public double getPlCenterLongitude() {
		return plCenterLongitude;
	}
	public void setPlCenterLongitude(double plCenterLongitude) {
		this.plCenterLongitude = plCenterLongitude;
	}
	public double getPlCenterLatitude() {
		return plCenterLatitude;
	}
	public void setPlCenterLatitude(double plCenterLatitude) {
		this.plCenterLatitude = plCenterLatitude;
	}
	public byte[] getPlLayoutPicture() {
		return plLayoutPicture;
	}
	public void setPlLayoutPicture(byte[] plLayoutPicture) {
		this.plLayoutPicture = plLayoutPicture;
	}
	public byte[] getUtilityLocationMap() {
		return utilityLocationMap;
	}
	public void setUtilityLocationMap(byte[] utilityLocationMap) {
		this.utilityLocationMap = utilityLocationMap;
	}
	public double getPlPrice() {
		return plPrice;
	}
	public void setPlPrice(double plPrice) {
		this.plPrice = plPrice;
	}
	@Override
	public String toString() {
		return "PlotInfo [plId=" + plId + ", plAddressId=" + plAddressId + ", plCode=" + plCode + ", plName=" + plName
				+ ", plType=" + plType + ", plNumber=" + plNumber + ", plMonzaNumber=" + plMonzaNumber + ", plCSNumber="
				+ plCSNumber + ", plMSNumber=" + plMSNumber + ", plRemark=" + plRemark + ", plTotalArea=" + plTotalArea
				+ ", plTotalBuildingCoverArea=" + plTotalBuildingCoverArea + ", plNumberOfBuilding="
				+ plNumberOfBuilding + ", plHeightFromMSL=" + plHeightFromMSL + ", plCenterLongitude="
				+ plCenterLongitude + ", plCenterLatitude=" + plCenterLatitude + ", plLayoutPicture="
				+ Arrays.toString(plLayoutPicture) + ", utilityLocationMap=" + Arrays.toString(utilityLocationMap)
				+ ", plPrice=" + plPrice + "]";
	}
	
	
	

}
