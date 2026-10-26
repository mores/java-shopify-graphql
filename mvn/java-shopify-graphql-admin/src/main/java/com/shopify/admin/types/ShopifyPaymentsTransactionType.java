package com.shopify.admin.types;

/**
 * The possible types of transactions.
 */
public enum ShopifyPaymentsTransactionType {
  /**
   * The ach_bank_failure_debit_fee transaction type.
   */
  ACH_BANK_FAILURE_DEBIT_FEE,

  /**
   * The ach_bank_failure_debit_reversal_fee transaction type.
   */
  ACH_BANK_FAILURE_DEBIT_REVERSAL_FEE,

  /**
   * The ads_publisher_credit transaction type.
   */
  ADS_PUBLISHER_CREDIT,

  /**
   * The ads_publisher_credit_reversal transaction type.
   */
  ADS_PUBLISHER_CREDIT_REVERSAL,

  /**
   * The chargeback_protection_credit transaction type.
   */
  CHARGEBACK_PROTECTION_CREDIT,

  /**
   * The chargeback_protection_credit_reversal transaction type.
   */
  CHARGEBACK_PROTECTION_CREDIT_REVERSAL,

  /**
   * The chargeback_protection_debit transaction type.
   */
  CHARGEBACK_PROTECTION_DEBIT,

  /**
   * The chargeback_protection_debit_reversal transaction type.
   */
  CHARGEBACK_PROTECTION_DEBIT_REVERSAL,

  /**
   * The collections_credit transaction type.
   */
  COLLECTIONS_CREDIT,

  /**
   * The collections_credit_reversal transaction type.
   */
  COLLECTIONS_CREDIT_REVERSAL,

  /**
   * The promotion_credit transaction type.
   */
  PROMOTION_CREDIT,

  /**
   * The promotion_credit_reversal transaction type.
   */
  PROMOTION_CREDIT_REVERSAL,

  /**
   * The anomaly_credit transaction type.
   */
  ANOMALY_CREDIT,

  /**
   * The anomaly_credit_reversal transaction type.
   */
  ANOMALY_CREDIT_REVERSAL,

  /**
   * The anomaly_debit transaction type.
   */
  ANOMALY_DEBIT,

  /**
   * The anomaly_debit_reversal transaction type.
   */
  ANOMALY_DEBIT_REVERSAL,

  /**
   * The vat_refund_credit transaction type.
   */
  VAT_REFUND_CREDIT,

  /**
   * The vat_refund_credit_reversal transaction type.
   */
  VAT_REFUND_CREDIT_REVERSAL,

  /**
   * The channel_credit transaction type.
   */
  CHANNEL_CREDIT,

  /**
   * The channel_credit_reversal transaction type.
   */
  CHANNEL_CREDIT_REVERSAL,

  /**
   * The channel_transfer_credit transaction type.
   */
  CHANNEL_TRANSFER_CREDIT,

  /**
   * The channel_transfer_credit_reversal transaction type.
   */
  CHANNEL_TRANSFER_CREDIT_REVERSAL,

  /**
   * The channel_transfer_debit transaction type.
   */
  CHANNEL_TRANSFER_DEBIT,

  /**
   * The channel_transfer_debit_reversal transaction type.
   */
  CHANNEL_TRANSFER_DEBIT_REVERSAL,

  /**
   * The channel_promotion_credit transaction type.
   */
  CHANNEL_PROMOTION_CREDIT,

  /**
   * The channel_promotion_credit_reversal transaction type.
   */
  CHANNEL_PROMOTION_CREDIT_REVERSAL,

  /**
   * The marketplace_fee_credit transaction type.
   */
  MARKETPLACE_FEE_CREDIT,

  /**
   * The marketplace_fee_credit_reversal transaction type.
   */
  MARKETPLACE_FEE_CREDIT_REVERSAL,

  /**
   * The merchant_goodwill_credit transaction type.
   */
  MERCHANT_GOODWILL_CREDIT,

  /**
   * The merchant_goodwill_credit_reversal transaction type.
   */
  MERCHANT_GOODWILL_CREDIT_REVERSAL,

  /**
   * The tax_adjustment_debit transaction type.
   */
  TAX_ADJUSTMENT_DEBIT,

  /**
   * The tax_adjustment_debit_reversal transaction type.
   */
  TAX_ADJUSTMENT_DEBIT_REVERSAL,

  /**
   * The tax_adjustment_credit transaction type.
   */
  TAX_ADJUSTMENT_CREDIT,

  /**
   * The tax_adjustment_credit_reversal transaction type.
   */
  TAX_ADJUSTMENT_CREDIT_REVERSAL,

  /**
   * The billing_debit transaction type.
   */
  BILLING_DEBIT,

  /**
   * The billing_debit_reversal transaction type.
   */
  BILLING_DEBIT_REVERSAL,

  /**
   * The shop_cash_credit transaction type.
   */
  SHOP_CASH_CREDIT,

  /**
   * The shop_cash_credit_reversal transaction type.
   */
  SHOP_CASH_CREDIT_REVERSAL,

  /**
   * The shop_cash_billing_debit transaction type.
   */
  SHOP_CASH_BILLING_DEBIT,

  /**
   * The shop_cash_billing_debit_reversal transaction type.
   */
  SHOP_CASH_BILLING_DEBIT_REVERSAL,

  /**
   * The shop_cash_refund_debit transaction type.
   */
  SHOP_CASH_REFUND_DEBIT,

  /**
   * The shop_cash_refund_debit_reversal transaction type.
   */
  SHOP_CASH_REFUND_DEBIT_REVERSAL,

  /**
   * The shop_cash_campaign_billing_debit transaction type.
   */
  SHOP_CASH_CAMPAIGN_BILLING_DEBIT,

  /**
   * The shop_cash_campaign_billing_debit_reversal transaction type.
   */
  SHOP_CASH_CAMPAIGN_BILLING_DEBIT_REVERSAL,

  /**
   * The shop_cash_campaign_billing_credit transaction type.
   */
  SHOP_CASH_CAMPAIGN_BILLING_CREDIT,

  /**
   * The shop_cash_campaign_billing_credit_reversal transaction type.
   */
  SHOP_CASH_CAMPAIGN_BILLING_CREDIT_REVERSAL,

  /**
   * The seller_protection_credit transaction type.
   */
  SELLER_PROTECTION_CREDIT,

  /**
   * The seller_protection_credit_reversal transaction type.
   */
  SELLER_PROTECTION_CREDIT_REVERSAL,

  /**
   * The shopify_collective_debit transaction type.
   */
  SHOPIFY_COLLECTIVE_DEBIT,

  /**
   * The shopify_collective_debit_reversal transaction type.
   */
  SHOPIFY_COLLECTIVE_DEBIT_REVERSAL,

  /**
   * The shopify_collective_credit transaction type.
   */
  SHOPIFY_COLLECTIVE_CREDIT,

  /**
   * The shopify_collective_credit_reversal transaction type.
   */
  SHOPIFY_COLLECTIVE_CREDIT_REVERSAL,

  /**
   * The lending_debit transaction type.
   */
  LENDING_DEBIT,

  /**
   * The lending_debit_reversal transaction type.
   */
  LENDING_DEBIT_REVERSAL,

  /**
   * The lending_credit transaction type.
   */
  LENDING_CREDIT,

  /**
   * The lending_credit_reversal transaction type.
   */
  LENDING_CREDIT_REVERSAL,

  /**
   * The lending_capital_remittance transaction type.
   */
  LENDING_CAPITAL_REMITTANCE,

  /**
   * The lending_capital_remittance_reversal transaction type.
   */
  LENDING_CAPITAL_REMITTANCE_REVERSAL,

  /**
   * The lending_credit_remittance transaction type.
   */
  LENDING_CREDIT_REMITTANCE,

  /**
   * The lending_credit_remittance_reversal transaction type.
   */
  LENDING_CREDIT_REMITTANCE_REVERSAL,

  /**
   * The lending_capital_refund transaction type.
   */
  LENDING_CAPITAL_REFUND,

  /**
   * The lending_capital_refund_reversal transaction type.
   */
  LENDING_CAPITAL_REFUND_REVERSAL,

  /**
   * The lending_credit_refund transaction type.
   */
  LENDING_CREDIT_REFUND,

  /**
   * The lending_credit_refund_reversal transaction type.
   */
  LENDING_CREDIT_REFUND_REVERSAL,

  /**
   * The balance_transfer_inbound transaction type.
   */
  BALANCE_TRANSFER_INBOUND,

  /**
   * The balance_transfer_outbound transaction type.
   */
  BALANCE_TRANSFER_OUTBOUND,

  /**
   * The markets_pro_credit transaction type.
   */
  MARKETS_PRO_CREDIT,

  /**
   * The customs_duty_adjustment transaction type.
   */
  CUSTOMS_DUTY_ADJUSTMENT,

  /**
   * The import_tax_adjustment transaction type.
   */
  IMPORT_TAX_ADJUSTMENT,

  /**
   * The shipping_label_adjustment transaction type.
   */
  SHIPPING_LABEL_ADJUSTMENT,

  /**
   * The shipping_label_adjustment_base transaction type.
   */
  SHIPPING_LABEL_ADJUSTMENT_BASE,

  /**
   * The shipping_label_adjustment_surcharge transaction type.
   */
  SHIPPING_LABEL_ADJUSTMENT_SURCHARGE,

  /**
   * The shipping_return_to_origin_adjustment transaction type.
   */
  SHIPPING_RETURN_TO_ORIGIN_ADJUSTMENT,

  /**
   * The shipping_other_carrier_charge_adjustment transaction type.
   */
  SHIPPING_OTHER_CARRIER_CHARGE_ADJUSTMENT,

  /**
   * The charge_adjustment transaction type.
   */
  CHARGE_ADJUSTMENT,

  /**
   * The refund_adjustment transaction type.
   */
  REFUND_ADJUSTMENT,

  /**
   * The chargeback_fee transaction type.
   */
  CHARGEBACK_FEE,

  /**
   * The chargeback_fee_refund transaction type.
   */
  CHARGEBACK_FEE_REFUND,

  /**
   * The transfer transaction type.
   */
  TRANSFER,

  /**
   * The transfer_failure transaction type.
   */
  TRANSFER_FAILURE,

  /**
   * The transfer_cancel transaction type.
   */
  TRANSFER_CANCEL,

  /**
   * The reserved_funds_withdrawal transaction type.
   */
  RESERVED_FUNDS_WITHDRAWAL,

  /**
   * The reserved_funds_reversal transaction type.
   */
  RESERVED_FUNDS_REVERSAL,

  /**
   * The risk_reversal transaction type.
   */
  RISK_REVERSAL,

  /**
   * The risk_withdrawal transaction type.
   */
  RISK_WITHDRAWAL,

  /**
   * The referral_fee transaction type.
   */
  REFERRAL_FEE,

  /**
   * The referral_fee_tax transaction type.
   */
  REFERRAL_FEE_TAX,

  /**
   * The merchant_to_merchant_debit transaction type.
   */
  MERCHANT_TO_MERCHANT_DEBIT,

  /**
   * The merchant_to_merchant_debit_reversal transaction type.
   */
  MERCHANT_TO_MERCHANT_DEBIT_REVERSAL,

  /**
   * The merchant_to_merchant_credit transaction type.
   */
  MERCHANT_TO_MERCHANT_CREDIT,

  /**
   * The merchant_to_merchant_credit_reversal transaction type.
   */
  MERCHANT_TO_MERCHANT_CREDIT_REVERSAL,

  /**
   * The shopify_source_debit transaction type.
   */
  SHOPIFY_SOURCE_DEBIT,

  /**
   * The shopify_source_debit_reversal transaction type.
   */
  SHOPIFY_SOURCE_DEBIT_REVERSAL,

  /**
   * The shopify_source_credit transaction type.
   */
  SHOPIFY_SOURCE_CREDIT,

  /**
   * The shopify_source_credit_reversal transaction type.
   */
  SHOPIFY_SOURCE_CREDIT_REVERSAL,

  /**
   * The charge transaction type.
   */
  CHARGE,

  /**
   * The refund transaction type.
   */
  REFUND,

  /**
   * The refund_failure transaction type.
   */
  REFUND_FAILURE,

  /**
   * The application_fee_refund transaction type.
   */
  APPLICATION_FEE_REFUND,

  /**
   * The adjustment transaction type.
   */
  ADJUSTMENT,

  /**
   * The dispute_withdrawal transaction type.
   */
  DISPUTE_WITHDRAWAL,

  /**
   * The dispute_reversal transaction type.
   */
  DISPUTE_REVERSAL,

  /**
   * The shipping_label transaction type.
   */
  SHIPPING_LABEL,

  /**
   * The customs_duty transaction type.
   */
  CUSTOMS_DUTY,

  /**
   * The import_tax transaction type.
   */
  IMPORT_TAX,

  /**
   * The chargeback_hold transaction type.
   */
  CHARGEBACK_HOLD,

  /**
   * The chargeback_hold_release transaction type.
   */
  CHARGEBACK_HOLD_RELEASE,

  /**
   * The currency_conversion transaction type.
   */
  CURRENCY_CONVERSION,

  /**
   * The reserved_funds transaction type.
   */
  RESERVED_FUNDS,

  /**
   * The stripe_fee transaction type.
   */
  STRIPE_FEE,

  /**
   * The transfer_refund transaction type.
   */
  TRANSFER_REFUND,

  /**
   * The advance transaction type.
   */
  ADVANCE,

  /**
   * The advance funding transaction type.
   */
  ADVANCE_FUNDING,

  /**
   * The tax refund transaction type.
   */
  IMPORT_TAX_REFUND
}
