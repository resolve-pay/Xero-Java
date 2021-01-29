/*
 * Xero Bank Feeds API
 * The Bank Feeds API is a closed API that is only available to financial institutions that have an established financial services partnership with Xero. If you're an existing financial services partner that wants access, contact your local Partner Manager. If you're a financial institution who wants to provide bank feeds to your business customers, contact us to become a financial services partner.
 *
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.xero.models.bankfeeds;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * ISO-3166 alpha-2 country code, e.g. US, AU This element is required only when the Application
 * supports multi-region. Talk to your Partner Manager to confirm if this is the case.
 */
public enum CountryCode {
  AD("AD"),

  AE("AE"),

  AF("AF"),

  AG("AG"),

  AI("AI"),

  AL("AL"),

  AM("AM"),

  AN("AN"),

  AO("AO"),

  AQ("AQ"),

  AR("AR"),

  AS("AS"),

  AT("AT"),

  AU("AU"),

  AW("AW"),

  AZ("AZ"),

  BA("BA"),

  BB("BB"),

  BD("BD"),

  BE("BE"),

  BF("BF"),

  BG("BG"),

  BH("BH"),

  BI("BI"),

  BJ("BJ"),

  BL("BL"),

  BM("BM"),

  BN("BN"),

  BO("BO"),

  BR("BR"),

  BS("BS"),

  BT("BT"),

  BW("BW"),

  BY("BY"),

  BZ("BZ"),

  CA("CA"),

  CC("CC"),

  CD("CD"),

  CF("CF"),

  CG("CG"),

  CH("CH"),

  CI("CI"),

  CK("CK"),

  CL("CL"),

  CM("CM"),

  CN("CN"),

  CO("CO"),

  CR("CR"),

  CU("CU"),

  CV("CV"),

  CW("CW"),

  CX("CX"),

  CY("CY"),

  CZ("CZ"),

  DE("DE"),

  DJ("DJ"),

  DK("DK"),

  DM("DM"),

  DO("DO"),

  DZ("DZ"),

  EC("EC"),

  EE("EE"),

  EG("EG"),

  EH("EH"),

  ER("ER"),

  ES("ES"),

  ET("ET"),

  FI("FI"),

  FJ("FJ"),

  FK("FK"),

  FM("FM"),

  FO("FO"),

  FR("FR"),

  GA("GA"),

  GB("GB"),

  GD("GD"),

  GE("GE"),

  GG("GG"),

  GH("GH"),

  GI("GI"),

  GL("GL"),

  GM("GM"),

  GN("GN"),

  GQ("GQ"),

  GR("GR"),

  GT("GT"),

  GU("GU"),

  GW("GW"),

  GY("GY"),

  HK("HK"),

  HN("HN"),

  HR("HR"),

  HT("HT"),

  HU("HU"),

  ID("ID"),

  IE("IE"),

  IL("IL"),

  IM("IM"),

  IN("IN"),

  IO("IO"),

  IQ("IQ"),

  IR("IR"),

  IS("IS"),

  IT("IT"),

  JE("JE"),

  JM("JM"),

  JO("JO"),

  JP("JP"),

  KE("KE"),

  KG("KG"),

  KH("KH"),

  KI("KI"),

  KM("KM"),

  KN("KN"),

  KP("KP"),

  KR("KR"),

  KW("KW"),

  KY("KY"),

  KZ("KZ"),

  LA("LA"),

  LB("LB"),

  LC("LC"),

  LI("LI"),

  LK("LK"),

  LR("LR"),

  LS("LS"),

  LT("LT"),

  LU("LU"),

  LV("LV"),

  LY("LY"),

  MA("MA"),

  MC("MC"),

  MD("MD"),

  ME("ME"),

  MF("MF"),

  MG("MG"),

  MH("MH"),

  MK("MK"),

  ML("ML"),

  MM("MM"),

  MN("MN"),

  MO("MO"),

  MP("MP"),

  MR("MR"),

  MS("MS"),

  MT("MT"),

  MU("MU"),

  MV("MV"),

  MW("MW"),

  MX("MX"),

  MY("MY"),

  MZ("MZ"),

  NA("NA"),

  NC("NC"),

  NE("NE"),

  NG("NG"),

  NI("NI"),

  NL("NL"),

  FALSE("false"),

  NP("NP"),

  NR("NR"),

  NU("NU"),

  NZ("NZ"),

  OM("OM"),

  PA("PA"),

  PE("PE"),

  PF("PF"),

  PG("PG"),

  PH("PH"),

  PK("PK"),

  PL("PL"),

  PM("PM"),

  PN("PN"),

  PR("PR"),

  PS("PS"),

  PT("PT"),

  PW("PW"),

  PY("PY"),

  QA("QA"),

  RE("RE"),

  RO("RO"),

  RS("RS"),

  RU("RU"),

  RW("RW"),

  SA("SA"),

  SB("SB"),

  SC("SC"),

  SD("SD"),

  SE("SE"),

  SG("SG"),

  SH("SH"),

  SI("SI"),

  SJ("SJ"),

  SK("SK"),

  SL("SL"),

  SM("SM"),

  SN("SN"),

  SO("SO"),

  SR("SR"),

  SS("SS"),

  ST("ST"),

  SV("SV"),

  SX("SX"),

  SY("SY"),

  SZ("SZ"),

  TC("TC"),

  TD("TD"),

  TG("TG"),

  TH("TH"),

  TJ("TJ"),

  TK("TK"),

  TL("TL"),

  TM("TM"),

  TN("TN"),

  TO("TO"),

  TR("TR"),

  TT("TT"),

  TV("TV"),

  TW("TW"),

  TZ("TZ"),

  UA("UA"),

  UG("UG"),

  US("US"),

  UY("UY"),

  UZ("UZ"),

  VA("VA"),

  VC("VC"),

  VE("VE"),

  VG("VG"),

  VI("VI"),

  VN("VN"),

  VU("VU"),

  WF("WF"),

  WS("WS"),

  XK("XK"),

  YE("YE"),

  YT("YT"),

  ZA("ZA"),

  ZM("ZM"),

  ZW("ZW");

  private String value;

  CountryCode(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static CountryCode fromValue(String value) {
    for (CountryCode b : CountryCode.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}
