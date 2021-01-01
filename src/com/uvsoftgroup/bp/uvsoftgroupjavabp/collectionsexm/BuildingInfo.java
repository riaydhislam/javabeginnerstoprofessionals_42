package com.uvsoftgroup.bp.uvsoftgroupjavabp.collectionsexm;

import java.math.BigDecimal;
import java.util.Arrays;

public class BuildingInfo {
	long buId;
	long buAddressId,buPlId;
	String buCode,buName,buUseType,buRemark;
	BigDecimal buNumberOfFloor,buTotalHeight,buNumberOfFloorUnit,buTotalGroundArea,buTotalFloorArea,buSetBackFront;
	BigDecimal buSetBackBack,buSetBackRight,buSetBackLeft,buCenterLongitude,buCenterLatitude;
	double buLength;
	double buWide;
	byte [] buLayoutPicture;
	
	// standard getter and setter methods
	public double getBuLength() {
		return buLength;
	}
	public void setBuLength(double buLength) {
		this.buLength = buLength;
	}
	public double getBuWide() {
		return buWide;
	}
	public void setBuWide(double buWide) {
		this.buWide = buWide;
	}
	public long getBuId() {
		return buId;
	}
	public void setBuId(long buId) {
		this.buId = buId;
	}
	public long getBuAddressId() {
		return buAddressId;
	}
	public void setBuAddressId(long buAddressId) {
		this.buAddressId = buAddressId;
	}
	public long getBuPlId() {
		return buPlId;
	}
	public void setBuPlId(long buPlId) {
		this.buPlId = buPlId;
	}
	public String getBuCode() {
		return buCode;
	}
	public void setBuCode(String buCode) {
		this.buCode = buCode;
	}
	public String getBuName() {
		return buName;
	}
	public void setBuName(String buName) {
		this.buName = buName;
	}
	public String getBuUseType() {
		return buUseType;
	}
	public void setBuUseType(String buUseType) {
		this.buUseType = buUseType;
	}
	public String getBuRemark() {
		return buRemark;
	}
	public void setBuRemark(String buRemark) {
		this.buRemark = buRemark;
	}
	public BigDecimal getBuNumberOfFloor() {
		return buNumberOfFloor;
	}
	public void setBuNumberOfFloor(BigDecimal buNumberOfFloor) {
		this.buNumberOfFloor = buNumberOfFloor;
	}
	public BigDecimal getBuTotalHeight() {
		return buTotalHeight;
	}
	public void setBuTotalHeight(BigDecimal buTotalHeight) {
		this.buTotalHeight = buTotalHeight;
	}
	public BigDecimal getBuNumberOfFloorUnit() {
		return buNumberOfFloorUnit;
	}
	public void setBuNumberOfFloorUnit(BigDecimal buNumberOfFloorUnit) {
		this.buNumberOfFloorUnit = buNumberOfFloorUnit;
	}
	public BigDecimal getBuTotalGroundArea() {
		return buTotalGroundArea;
	}
	public void setBuTotalGroundArea(BigDecimal buTotalGroundArea) {
		this.buTotalGroundArea = buTotalGroundArea;
	}
	public BigDecimal getBuTotalFloorArea() {
		return buTotalFloorArea;
	}
	public void setBuTotalFloorArea(BigDecimal buTotalFloorArea) {
		this.buTotalFloorArea = buTotalFloorArea;
	}
	public BigDecimal getBuSetBackFront() {
		return buSetBackFront;
	}
	public void setBuSetBackFront(BigDecimal buSetBackFront) {
		this.buSetBackFront = buSetBackFront;
	}
	public BigDecimal getBuSetBackBack() {
		return buSetBackBack;
	}
	public void setBuSetBackBack(BigDecimal buSetBackBack) {
		this.buSetBackBack = buSetBackBack;
	}
	public BigDecimal getBuSetBackRight() {
		return buSetBackRight;
	}
	public void setBuSetBackRight(BigDecimal buSetBackRight) {
		this.buSetBackRight = buSetBackRight;
	}
	public BigDecimal getBuSetBackLeft() {
		return buSetBackLeft;
	}
	public void setBuSetBackLeft(BigDecimal buSetBackLeft) {
		this.buSetBackLeft = buSetBackLeft;
	}
	public BigDecimal getBuCenterLongitude() {
		return buCenterLongitude;
	}
	public void setBuCenterLongitude(BigDecimal buCenterLongitude) {
		this.buCenterLongitude = buCenterLongitude;
	}
	public BigDecimal getBuCenterLatitude() {
		return buCenterLatitude;
	}
	public void setBuCenterLatitude(BigDecimal buCenterLatitude) {
		this.buCenterLatitude = buCenterLatitude;
	}
	public byte[] getBuLayoutPicture() {
		return buLayoutPicture;
	}
	public void setBuLayoutPicture(byte[] buLayoutPicture) {
		this.buLayoutPicture = buLayoutPicture;
	}
	@Override
	public String toString() {
		return "BuildingInfo [buId=" + buId + ", buAddressId=" + buAddressId + ", buPlId=" + buPlId + ", buCode="
				+ buCode + ", buName=" + buName + ", buUseType=" + buUseType + ", buRemark=" + buRemark
				+ ", buNumberOfFloor=" + buNumberOfFloor + ", buTotalHeight=" + buTotalHeight + ", buNumberOfFloorUnit="
				+ buNumberOfFloorUnit + ", buTotalGroundArea=" + buTotalGroundArea + ", buTotalFloorArea="
				+ buTotalFloorArea + ", buSetBackFront=" + buSetBackFront + ", buSetBackBack=" + buSetBackBack
				+ ", buSetBackRight=" + buSetBackRight + ", buSetBackLeft=" + buSetBackLeft + ", buCenterLongitude="
				+ buCenterLongitude + ", buCenterLatitude=" + buCenterLatitude + ", buLength=" + buLength + ", buWide="
				+ buWide + ", buLayoutPicture=" + Arrays.toString(buLayoutPicture) + "]";
	}


	
	
	
}
