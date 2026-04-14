package com.shopify.storefront.types;

/**
 * Supported languages for retrieving translated storefront content. Pass a
 * language code to the [`@inContext`](https://shopify.dev/docs/storefronts/headless/building-with-the-storefront-api/in-context)
 * directive to return product titles, descriptions, and other translatable fields
 * in that language. 
 *
 * The [`Localization`](https://shopify.dev/docs/api/storefront/current/objects/Localization) object provides the list of available languages for the active country, and each
 * [`Country`](https://shopify.dev/docs/api/storefront/current/objects/Country) in [`availableCountries`](https://shopify.dev/docs/api/storefront/current/objects/Localization#field-Localization.fields.availableCountries)
 * includes its own available languages.
 */
public enum LanguageCode {
  AF,

  AK,

  AM,

  AR,

  AS,

  AZ,

  BE,

  BG,

  BM,

  BN,

  BO,

  BR,

  BS,

  CA,

  CE,

  CKB,

  CS,

  CY,

  DA,

  DE,

  DZ,

  EE,

  EL,

  EN,

  EO,

  ES,

  ET,

  EU,

  FA,

  FF,

  FI,

  FIL,

  FO,

  FR,

  FY,

  GA,

  GD,

  GL,

  GU,

  GV,

  HA,

  HE,

  HI,

  HR,

  HU,

  HY,

  IA,

  ID,

  IG,

  II,

  IS,

  IT,

  JA,

  JV,

  KA,

  KI,

  KK,

  KL,

  KM,

  KN,

  KO,

  KS,

  KU,

  KW,

  KY,

  LB,

  LG,

  LN,

  LO,

  LT,

  LU,

  LV,

  MG,

  MI,

  MK,

  ML,

  MN,

  MR,

  MS,

  MT,

  MY,

  NB,

  ND,

  NE,

  NL,

  NN,

  NO,

  OM,

  OR,

  OS,

  PA,

  PL,

  PS,

  PT_BR,

  PT_PT,

  QU,

  RM,

  RN,

  RO,

  RU,

  RW,

  SA,

  SC,

  SD,

  SE,

  SG,

  SI,

  SK,

  SL,

  SN,

  SO,

  SQ,

  SR,

  SU,

  SV,

  SW,

  TA,

  TE,

  TG,

  TH,

  TI,

  TK,

  TO,

  TR,

  TT,

  UG,

  UK,

  UR,

  UZ,

  VI,

  WO,

  XH,

  YI,

  YO,

  ZH_CN,

  ZH_TW,

  ZU,

  ZH,

  PT,

  CU,

  VO,

  LA,

  SH,

  MO
}
