package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.PrivacyCountryCode;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Returns the customer privacy consent policies of a shop.
 */
public class ConsentPolicyGraphQLQuery extends GraphQLQuery {
  public ConsentPolicyGraphQLQuery(String id, PrivacyCountryCode countryCode, String regionCode,
      Boolean consentRequired, Boolean dataSaleOptOutRequired, String queryName,
      Set<String> fieldsSet) {
    super("query", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (countryCode != null || fieldsSet.contains("countryCode")) {
        getInput().put("countryCode", countryCode);
    }if (regionCode != null || fieldsSet.contains("regionCode")) {
        getInput().put("regionCode", regionCode);
    }if (consentRequired != null || fieldsSet.contains("consentRequired")) {
        getInput().put("consentRequired", consentRequired);
    }if (dataSaleOptOutRequired != null || fieldsSet.contains("dataSaleOptOutRequired")) {
        getInput().put("dataSaleOptOutRequired", dataSaleOptOutRequired);
    }
  }

  public ConsentPolicyGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "consentPolicy";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private PrivacyCountryCode countryCode;

    private String regionCode;

    private Boolean consentRequired;

    private Boolean dataSaleOptOutRequired;

    private String queryName;

    public ConsentPolicyGraphQLQuery build() {
      return new ConsentPolicyGraphQLQuery(id, countryCode, regionCode, consentRequired, dataSaleOptOutRequired, queryName, fieldsSet);
               
    }

    /**
     * Return the policy with the provided ID.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * Return policies with the provided country code.
     */
    public Builder countryCode(PrivacyCountryCode countryCode) {
      this.countryCode = countryCode;
      this.fieldsSet.add("countryCode");
      return this;
    }

    /**
     * Return policies with the provided region code.
     */
    public Builder regionCode(String regionCode) {
      this.regionCode = regionCode;
      this.fieldsSet.add("regionCode");
      return this;
    }

    /**
     * Return policies where consent is required or not.
     */
    public Builder consentRequired(Boolean consentRequired) {
      this.consentRequired = consentRequired;
      this.fieldsSet.add("consentRequired");
      return this;
    }

    /**
     * Return policies where data sale opt out is required or not.
     */
    public Builder dataSaleOptOutRequired(Boolean dataSaleOptOutRequired) {
      this.dataSaleOptOutRequired = dataSaleOptOutRequired;
      this.fieldsSet.add("dataSaleOptOutRequired");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
