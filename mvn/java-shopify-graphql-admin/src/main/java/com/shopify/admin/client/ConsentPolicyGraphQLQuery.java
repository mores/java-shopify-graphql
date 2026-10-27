package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.PrivacyCountryCode;
import graphql.language.VariableDefinition;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
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

  public ConsentPolicyGraphQLQuery(String id, PrivacyCountryCode countryCode, String regionCode,
      Boolean consentRequired, Boolean dataSaleOptOutRequired, String queryName,
      Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
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
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
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

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String id;

    private PrivacyCountryCode countryCode;

    private String regionCode;

    private Boolean consentRequired;

    private Boolean dataSaleOptOutRequired;

    private String queryName;

    public ConsentPolicyGraphQLQuery build() {
      return new ConsentPolicyGraphQLQuery(id, countryCode, regionCode, consentRequired, dataSaleOptOutRequired, queryName, fieldsSet, variableReferences, variableDefinitions);
               
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
     * Return the policy with the provided ID.
     */
    public Builder idReference(String variableRef) {
      this.variableReferences.put("id", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.TypeName("ID")).build());
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
     * Return policies with the provided country code.
     */
    public Builder countryCodeReference(String variableRef) {
      this.variableReferences.put("countryCode", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.TypeName("PrivacyCountryCode")).build());
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
     * Return policies with the provided region code.
     */
    public Builder regionCodeReference(String variableRef) {
      this.variableReferences.put("regionCode", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.TypeName("String")).build());
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
     * Return policies where consent is required or not.
     */
    public Builder consentRequiredReference(String variableRef) {
      this.variableReferences.put("consentRequired", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.TypeName("Boolean")).build());
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

    /**
     * Return policies where data sale opt out is required or not.
     */
    public Builder dataSaleOptOutRequiredReference(String variableRef) {
      this.variableReferences.put("dataSaleOptOutRequired", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.TypeName("Boolean")).build());
      this.fieldsSet.add("dataSaleOptOutRequired");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
