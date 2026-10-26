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
  /**
   * Afrikaans.
   */
  AF,

  /**
   * Akan.
   */
  AK,

  /**
   * Amharic.
   */
  AM,

  /**
   * Arabic.
   */
  AR,

  /**
   * Assamese.
   */
  AS,

  /**
   * Azerbaijani.
   */
  AZ,

  /**
   * Belarusian.
   */
  BE,

  /**
   * Bulgarian.
   */
  BG,

  /**
   * Bambara.
   */
  BM,

  /**
   * Bangla.
   */
  BN,

  /**
   * Tibetan.
   */
  BO,

  /**
   * Breton.
   */
  BR,

  /**
   * Bosnian.
   */
  BS,

  /**
   * Catalan.
   */
  CA,

  /**
   * Chechen.
   */
  CE,

  /**
   * Central Kurdish.
   */
  CKB,

  /**
   * Czech.
   */
  CS,

  /**
   * Welsh.
   */
  CY,

  /**
   * Danish.
   */
  DA,

  /**
   * German.
   */
  DE,

  /**
   * Dzongkha.
   */
  DZ,

  /**
   * Ewe.
   */
  EE,

  /**
   * Greek.
   */
  EL,

  /**
   * English.
   */
  EN,

  /**
   * Esperanto.
   */
  EO,

  /**
   * Spanish.
   */
  ES,

  /**
   * Estonian.
   */
  ET,

  /**
   * Basque.
   */
  EU,

  /**
   * Persian.
   */
  FA,

  /**
   * Fulah.
   */
  FF,

  /**
   * Finnish.
   */
  FI,

  /**
   * Filipino.
   */
  FIL,

  /**
   * Faroese.
   */
  FO,

  /**
   * French.
   */
  FR,

  /**
   * Western Frisian.
   */
  FY,

  /**
   * Irish.
   */
  GA,

  /**
   * Scottish Gaelic.
   */
  GD,

  /**
   * Galician.
   */
  GL,

  /**
   * Gujarati.
   */
  GU,

  /**
   * Manx.
   */
  GV,

  /**
   * Hausa.
   */
  HA,

  /**
   * Hebrew.
   */
  HE,

  /**
   * Hindi.
   */
  HI,

  /**
   * Croatian.
   */
  HR,

  /**
   * Hungarian.
   */
  HU,

  /**
   * Armenian.
   */
  HY,

  /**
   * Interlingua.
   */
  IA,

  /**
   * Indonesian.
   */
  ID,

  /**
   * Igbo.
   */
  IG,

  /**
   * Sichuan Yi.
   */
  II,

  /**
   * Icelandic.
   */
  IS,

  /**
   * Italian.
   */
  IT,

  /**
   * Japanese.
   */
  JA,

  /**
   * Javanese.
   */
  JV,

  /**
   * Georgian.
   */
  KA,

  /**
   * Kikuyu.
   */
  KI,

  /**
   * Kazakh.
   */
  KK,

  /**
   * Kalaallisut.
   */
  KL,

  /**
   * Khmer.
   */
  KM,

  /**
   * Kannada.
   */
  KN,

  /**
   * Korean.
   */
  KO,

  /**
   * Kashmiri.
   */
  KS,

  /**
   * Kurdish.
   */
  KU,

  /**
   * Cornish.
   */
  KW,

  /**
   * Kyrgyz.
   */
  KY,

  /**
   * Luxembourgish.
   */
  LB,

  /**
   * Ganda.
   */
  LG,

  /**
   * Lingala.
   */
  LN,

  /**
   * Lao.
   */
  LO,

  /**
   * Lithuanian.
   */
  LT,

  /**
   * Luba-Katanga.
   */
  LU,

  /**
   * Latvian.
   */
  LV,

  /**
   * Malagasy.
   */
  MG,

  /**
   * Māori.
   */
  MI,

  /**
   * Macedonian.
   */
  MK,

  /**
   * Malayalam.
   */
  ML,

  /**
   * Mongolian.
   */
  MN,

  /**
   * Marathi.
   */
  MR,

  /**
   * Malay.
   */
  MS,

  /**
   * Maltese.
   */
  MT,

  /**
   * Burmese.
   */
  MY,

  /**
   * Norwegian (Bokmål).
   */
  NB,

  /**
   * North Ndebele.
   */
  ND,

  /**
   * Nepali.
   */
  NE,

  /**
   * Dutch.
   */
  NL,

  /**
   * Norwegian Nynorsk.
   */
  NN,

  /**
   * Norwegian.
   */
  NO,

  /**
   * Oromo.
   */
  OM,

  /**
   * Odia.
   */
  OR,

  /**
   * Ossetic.
   */
  OS,

  /**
   * Punjabi.
   */
  PA,

  /**
   * Polish.
   */
  PL,

  /**
   * Pashto.
   */
  PS,

  /**
   * Portuguese (Brazil).
   */
  PT_BR,

  /**
   * Portuguese (Portugal).
   */
  PT_PT,

  /**
   * Quechua.
   */
  QU,

  /**
   * Romansh.
   */
  RM,

  /**
   * Rundi.
   */
  RN,

  /**
   * Romanian.
   */
  RO,

  /**
   * Russian.
   */
  RU,

  /**
   * Kinyarwanda.
   */
  RW,

  /**
   * Sanskrit.
   */
  SA,

  /**
   * Sardinian.
   */
  SC,

  /**
   * Sindhi.
   */
  SD,

  /**
   * Northern Sami.
   */
  SE,

  /**
   * Sango.
   */
  SG,

  /**
   * Sinhala.
   */
  SI,

  /**
   * Slovak.
   */
  SK,

  /**
   * Slovenian.
   */
  SL,

  /**
   * Shona.
   */
  SN,

  /**
   * Somali.
   */
  SO,

  /**
   * Albanian.
   */
  SQ,

  /**
   * Serbian.
   */
  SR,

  /**
   * Sundanese.
   */
  SU,

  /**
   * Swedish.
   */
  SV,

  /**
   * Swahili.
   */
  SW,

  /**
   * Tamil.
   */
  TA,

  /**
   * Telugu.
   */
  TE,

  /**
   * Tajik.
   */
  TG,

  /**
   * Thai.
   */
  TH,

  /**
   * Tigrinya.
   */
  TI,

  /**
   * Turkmen.
   */
  TK,

  /**
   * Tongan.
   */
  TO,

  /**
   * Turkish.
   */
  TR,

  /**
   * Tatar.
   */
  TT,

  /**
   * Uyghur.
   */
  UG,

  /**
   * Ukrainian.
   */
  UK,

  /**
   * Urdu.
   */
  UR,

  /**
   * Uzbek.
   */
  UZ,

  /**
   * Vietnamese.
   */
  VI,

  /**
   * Wolof.
   */
  WO,

  /**
   * Xhosa.
   */
  XH,

  /**
   * Yiddish.
   */
  YI,

  /**
   * Yoruba.
   */
  YO,

  /**
   * Chinese (Simplified).
   */
  ZH_CN,

  /**
   * Chinese (Traditional).
   */
  ZH_TW,

  /**
   * Zulu.
   */
  ZU,

  /**
   * Chinese.
   */
  ZH,

  /**
   * Portuguese.
   */
  PT,

  /**
   * Church Slavic.
   */
  CU,

  /**
   * Volapük.
   */
  VO,

  /**
   * Latin.
   */
  LA,

  /**
   * Serbo-Croatian.
   */
  SH,

  /**
   * Moldavian.
   */
  MO
}
