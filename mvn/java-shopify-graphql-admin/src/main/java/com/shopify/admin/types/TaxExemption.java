package com.shopify.admin.types;

/**
 * Available customer tax exemptions.
 */
public enum TaxExemption {
  /**
   * This customer is exempt from specific taxes for holding a valid STATUS_CARD_EXEMPTION in Canada.
   */
  CA_STATUS_CARD_EXEMPTION,

  /**
   * This customer is exempt from specific taxes for holding a valid RESELLER_EXEMPTION in British Columbia.
   */
  CA_BC_RESELLER_EXEMPTION,

  /**
   * This customer is exempt from specific taxes for holding a valid RESELLER_EXEMPTION in Manitoba.
   */
  CA_MB_RESELLER_EXEMPTION,

  /**
   * This customer is exempt from specific taxes for holding a valid RESELLER_EXEMPTION in Saskatchewan.
   */
  CA_SK_RESELLER_EXEMPTION,

  /**
   * This customer is exempt from VPT (Vapour Products Tax) for holding a valid VPT_RESELLER_EXEMPTION in Saskatchewan.
   */
  CA_SK_VPT_RESELLER_EXEMPTION,

  /**
   * This customer is exempt from VPT (Vapour Products Tax) for holding a valid
   * VPT_RESELLER_EXEMPTION in Newfoundland and Labrador.
   */
  CA_NL_VPT_RESELLER_EXEMPTION,

  /**
   * This customer is exempt from specific taxes for holding a valid DIPLOMAT_EXEMPTION in Canada.
   */
  CA_DIPLOMAT_EXEMPTION,

  /**
   * This customer is exempt from specific taxes for holding a valid COMMERCIAL_FISHERY_EXEMPTION in British Columbia.
   */
  CA_BC_COMMERCIAL_FISHERY_EXEMPTION,

  /**
   * This customer is exempt from specific taxes for holding a valid COMMERCIAL_FISHERY_EXEMPTION in Manitoba.
   */
  CA_MB_COMMERCIAL_FISHERY_EXEMPTION,

  /**
   * This customer is exempt from specific taxes for holding a valid COMMERCIAL_FISHERY_EXEMPTION in Nova Scotia.
   */
  CA_NS_COMMERCIAL_FISHERY_EXEMPTION,

  /**
   * This customer is exempt from specific taxes for holding a valid COMMERCIAL_FISHERY_EXEMPTION in Prince Edward Island.
   */
  CA_PE_COMMERCIAL_FISHERY_EXEMPTION,

  /**
   * This customer is exempt from specific taxes for holding a valid COMMERCIAL_FISHERY_EXEMPTION in Saskatchewan.
   */
  CA_SK_COMMERCIAL_FISHERY_EXEMPTION,

  /**
   * This customer is exempt from specific taxes for holding a valid PRODUCTION_AND_MACHINERY_EXEMPTION in British Columbia.
   */
  CA_BC_PRODUCTION_AND_MACHINERY_EXEMPTION,

  /**
   * This customer is exempt from specific taxes for holding a valid PRODUCTION_AND_MACHINERY_EXEMPTION in Saskatchewan.
   */
  CA_SK_PRODUCTION_AND_MACHINERY_EXEMPTION,

  /**
   * This customer is exempt from specific taxes for holding a valid SUB_CONTRACTOR_EXEMPTION in British Columbia.
   */
  CA_BC_SUB_CONTRACTOR_EXEMPTION,

  /**
   * This customer is exempt from specific taxes for holding a valid SUB_CONTRACTOR_EXEMPTION in Saskatchewan.
   */
  CA_SK_SUB_CONTRACTOR_EXEMPTION,

  /**
   * This customer is exempt from specific taxes for holding a valid CONTRACTOR_EXEMPTION in British Columbia.
   */
  CA_BC_CONTRACTOR_EXEMPTION,

  /**
   * This customer is exempt from specific taxes for holding a valid CONTRACTOR_EXEMPTION in Saskatchewan.
   */
  CA_SK_CONTRACTOR_EXEMPTION,

  /**
   * This customer is exempt from specific taxes for holding a valid PURCHASE_EXEMPTION in Ontario.
   */
  CA_ON_PURCHASE_EXEMPTION,

  /**
   * This customer is exempt from specific taxes for holding a valid FARMER_EXEMPTION in Manitoba.
   */
  CA_MB_FARMER_EXEMPTION,

  /**
   * This customer is exempt from specific taxes for holding a valid FARMER_EXEMPTION in Nova Scotia.
   */
  CA_NS_FARMER_EXEMPTION,

  /**
   * This customer is exempt from specific taxes for holding a valid FARMER_EXEMPTION in Saskatchewan.
   */
  CA_SK_FARMER_EXEMPTION,

  /**
   * This customer is exempt from VAT for purchases within the EU that is shipping
   * from outside of customer's country, as well as purchases from the EU to the UK.
   */
  EU_REVERSE_CHARGE_EXEMPTION_RULE,

  /**
   * This customer is exempt from specific taxes for holding a valid RESELLER_EXEMPTION in Alabama.
   */
  US_AL_RESELLER_EXEMPTION,

  /**
   * This customer is exempt from specific taxes for holding a valid RESELLER_EXEMPTION in Alaska.
   */
  US_AK_RESELLER_EXEMPTION,

  /**
   * This customer is exempt from specific taxes for holding a valid RESELLER_EXEMPTION in Arizona.
   */
  US_AZ_RESELLER_EXEMPTION,

  /**
   * This customer is exempt from specific taxes for holding a valid RESELLER_EXEMPTION in Arkansas.
   */
  US_AR_RESELLER_EXEMPTION,

  /**
   * This customer is exempt from specific taxes for holding a valid RESELLER_EXEMPTION in California.
   */
  US_CA_RESELLER_EXEMPTION,

  /**
   * This customer is exempt from specific taxes for holding a valid RESELLER_EXEMPTION in Colorado.
   */
  US_CO_RESELLER_EXEMPTION,

  /**
   * This customer is exempt from specific taxes for holding a valid RESELLER_EXEMPTION in Connecticut.
   */
  US_CT_RESELLER_EXEMPTION,

  /**
   * This customer is exempt from specific taxes for holding a valid RESELLER_EXEMPTION in Delaware.
   */
  US_DE_RESELLER_EXEMPTION,

  /**
   * This customer is exempt from specific taxes for holding a valid RESELLER_EXEMPTION in Florida.
   */
  US_FL_RESELLER_EXEMPTION,

  /**
   * This customer is exempt from specific taxes for holding a valid RESELLER_EXEMPTION in Georgia.
   */
  US_GA_RESELLER_EXEMPTION,

  /**
   * This customer is exempt from specific taxes for holding a valid RESELLER_EXEMPTION in Hawaii.
   */
  US_HI_RESELLER_EXEMPTION,

  /**
   * This customer is exempt from specific taxes for holding a valid RESELLER_EXEMPTION in Idaho.
   */
  US_ID_RESELLER_EXEMPTION,

  /**
   * This customer is exempt from specific taxes for holding a valid RESELLER_EXEMPTION in Illinois.
   */
  US_IL_RESELLER_EXEMPTION,

  /**
   * This customer is exempt from specific taxes for holding a valid RESELLER_EXEMPTION in Indiana.
   */
  US_IN_RESELLER_EXEMPTION,

  /**
   * This customer is exempt from specific taxes for holding a valid RESELLER_EXEMPTION in Iowa.
   */
  US_IA_RESELLER_EXEMPTION,

  /**
   * This customer is exempt from specific taxes for holding a valid RESELLER_EXEMPTION in Kansas.
   */
  US_KS_RESELLER_EXEMPTION,

  /**
   * This customer is exempt from specific taxes for holding a valid RESELLER_EXEMPTION in Kentucky.
   */
  US_KY_RESELLER_EXEMPTION,

  /**
   * This customer is exempt from specific taxes for holding a valid RESELLER_EXEMPTION in Louisiana.
   */
  US_LA_RESELLER_EXEMPTION,

  /**
   * This customer is exempt from specific taxes for holding a valid RESELLER_EXEMPTION in Maine.
   */
  US_ME_RESELLER_EXEMPTION,

  /**
   * This customer is exempt from specific taxes for holding a valid RESELLER_EXEMPTION in Maryland.
   */
  US_MD_RESELLER_EXEMPTION,

  /**
   * This customer is exempt from specific taxes for holding a valid RESELLER_EXEMPTION in Massachusetts.
   */
  US_MA_RESELLER_EXEMPTION,

  /**
   * This customer is exempt from specific taxes for holding a valid RESELLER_EXEMPTION in Michigan.
   */
  US_MI_RESELLER_EXEMPTION,

  /**
   * This customer is exempt from specific taxes for holding a valid RESELLER_EXEMPTION in Minnesota.
   */
  US_MN_RESELLER_EXEMPTION,

  /**
   * This customer is exempt from specific taxes for holding a valid RESELLER_EXEMPTION in Mississippi.
   */
  US_MS_RESELLER_EXEMPTION,

  /**
   * This customer is exempt from specific taxes for holding a valid RESELLER_EXEMPTION in Missouri.
   */
  US_MO_RESELLER_EXEMPTION,

  /**
   * This customer is exempt from specific taxes for holding a valid RESELLER_EXEMPTION in Montana.
   */
  US_MT_RESELLER_EXEMPTION,

  /**
   * This customer is exempt from specific taxes for holding a valid RESELLER_EXEMPTION in Nebraska.
   */
  US_NE_RESELLER_EXEMPTION,

  /**
   * This customer is exempt from specific taxes for holding a valid RESELLER_EXEMPTION in Nevada.
   */
  US_NV_RESELLER_EXEMPTION,

  /**
   * This customer is exempt from specific taxes for holding a valid RESELLER_EXEMPTION in New Hampshire.
   */
  US_NH_RESELLER_EXEMPTION,

  /**
   * This customer is exempt from specific taxes for holding a valid RESELLER_EXEMPTION in New Jersey.
   */
  US_NJ_RESELLER_EXEMPTION,

  /**
   * This customer is exempt from specific taxes for holding a valid RESELLER_EXEMPTION in New Mexico.
   */
  US_NM_RESELLER_EXEMPTION,

  /**
   * This customer is exempt from specific taxes for holding a valid RESELLER_EXEMPTION in New York.
   */
  US_NY_RESELLER_EXEMPTION,

  /**
   * This customer is exempt from specific taxes for holding a valid RESELLER_EXEMPTION in North Carolina.
   */
  US_NC_RESELLER_EXEMPTION,

  /**
   * This customer is exempt from specific taxes for holding a valid RESELLER_EXEMPTION in North Dakota.
   */
  US_ND_RESELLER_EXEMPTION,

  /**
   * This customer is exempt from specific taxes for holding a valid RESELLER_EXEMPTION in Ohio.
   */
  US_OH_RESELLER_EXEMPTION,

  /**
   * This customer is exempt from specific taxes for holding a valid RESELLER_EXEMPTION in Oklahoma.
   */
  US_OK_RESELLER_EXEMPTION,

  /**
   * This customer is exempt from specific taxes for holding a valid RESELLER_EXEMPTION in Oregon.
   */
  US_OR_RESELLER_EXEMPTION,

  /**
   * This customer is exempt from specific taxes for holding a valid RESELLER_EXEMPTION in Pennsylvania.
   */
  US_PA_RESELLER_EXEMPTION,

  /**
   * This customer is exempt from specific taxes for holding a valid RESELLER_EXEMPTION in Rhode Island.
   */
  US_RI_RESELLER_EXEMPTION,

  /**
   * This customer is exempt from specific taxes for holding a valid RESELLER_EXEMPTION in South Carolina.
   */
  US_SC_RESELLER_EXEMPTION,

  /**
   * This customer is exempt from specific taxes for holding a valid RESELLER_EXEMPTION in South Dakota.
   */
  US_SD_RESELLER_EXEMPTION,

  /**
   * This customer is exempt from specific taxes for holding a valid RESELLER_EXEMPTION in Tennessee.
   */
  US_TN_RESELLER_EXEMPTION,

  /**
   * This customer is exempt from specific taxes for holding a valid RESELLER_EXEMPTION in Texas.
   */
  US_TX_RESELLER_EXEMPTION,

  /**
   * This customer is exempt from specific taxes for holding a valid RESELLER_EXEMPTION in Utah.
   */
  US_UT_RESELLER_EXEMPTION,

  /**
   * This customer is exempt from specific taxes for holding a valid RESELLER_EXEMPTION in Vermont.
   */
  US_VT_RESELLER_EXEMPTION,

  /**
   * This customer is exempt from specific taxes for holding a valid RESELLER_EXEMPTION in Virginia.
   */
  US_VA_RESELLER_EXEMPTION,

  /**
   * This customer is exempt from specific taxes for holding a valid RESELLER_EXEMPTION in Washington.
   */
  US_WA_RESELLER_EXEMPTION,

  /**
   * This customer is exempt from specific taxes for holding a valid RESELLER_EXEMPTION in West Virginia.
   */
  US_WV_RESELLER_EXEMPTION,

  /**
   * This customer is exempt from specific taxes for holding a valid RESELLER_EXEMPTION in Wisconsin.
   */
  US_WI_RESELLER_EXEMPTION,

  /**
   * This customer is exempt from specific taxes for holding a valid RESELLER_EXEMPTION in Wyoming.
   */
  US_WY_RESELLER_EXEMPTION,

  /**
   * This customer is exempt from specific taxes for holding a valid RESELLER_EXEMPTION in Washington DC.
   */
  US_DC_RESELLER_EXEMPTION
}
