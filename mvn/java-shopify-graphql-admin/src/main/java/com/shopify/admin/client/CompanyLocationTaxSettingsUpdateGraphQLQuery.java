package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.TaxExemption;
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
 * Sets the tax settings for a company location.
 */
public class CompanyLocationTaxSettingsUpdateGraphQLQuery extends GraphQLQuery {
  public CompanyLocationTaxSettingsUpdateGraphQLQuery(String companyLocationId,
      String taxRegistrationId, Boolean taxExempt, List<TaxExemption> exemptionsToAssign,
      List<TaxExemption> exemptionsToRemove, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (companyLocationId != null || fieldsSet.contains("companyLocationId")) {
        getInput().put("companyLocationId", companyLocationId);
    }if (taxRegistrationId != null || fieldsSet.contains("taxRegistrationId")) {
        getInput().put("taxRegistrationId", taxRegistrationId);
    }if (taxExempt != null || fieldsSet.contains("taxExempt")) {
        getInput().put("taxExempt", taxExempt);
    }if (exemptionsToAssign != null || fieldsSet.contains("exemptionsToAssign")) {
        getInput().put("exemptionsToAssign", exemptionsToAssign);
    }if (exemptionsToRemove != null || fieldsSet.contains("exemptionsToRemove")) {
        getInput().put("exemptionsToRemove", exemptionsToRemove);
    }
  }

  public CompanyLocationTaxSettingsUpdateGraphQLQuery(String companyLocationId,
      String taxRegistrationId, Boolean taxExempt, List<TaxExemption> exemptionsToAssign,
      List<TaxExemption> exemptionsToRemove, String queryName, Set<String> fieldsSet,
      Map<String, String> variableReferences, List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (companyLocationId != null || fieldsSet.contains("companyLocationId")) {
        getInput().put("companyLocationId", companyLocationId);
    }if (taxRegistrationId != null || fieldsSet.contains("taxRegistrationId")) {
        getInput().put("taxRegistrationId", taxRegistrationId);
    }if (taxExempt != null || fieldsSet.contains("taxExempt")) {
        getInput().put("taxExempt", taxExempt);
    }if (exemptionsToAssign != null || fieldsSet.contains("exemptionsToAssign")) {
        getInput().put("exemptionsToAssign", exemptionsToAssign);
    }if (exemptionsToRemove != null || fieldsSet.contains("exemptionsToRemove")) {
        getInput().put("exemptionsToRemove", exemptionsToRemove);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public CompanyLocationTaxSettingsUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "companyLocationTaxSettingsUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String companyLocationId;

    private String taxRegistrationId;

    private Boolean taxExempt;

    private List<TaxExemption> exemptionsToAssign;

    private List<TaxExemption> exemptionsToRemove;

    private String queryName;

    public CompanyLocationTaxSettingsUpdateGraphQLQuery build() {
      return new CompanyLocationTaxSettingsUpdateGraphQLQuery(companyLocationId, taxRegistrationId, taxExempt, exemptionsToAssign, exemptionsToRemove, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The ID of the company location that the tax settings get assigned to.
     */
    public Builder companyLocationId(String companyLocationId) {
      this.companyLocationId = companyLocationId;
      this.fieldsSet.add("companyLocationId");
      return this;
    }

    /**
     * The ID of the company location that the tax settings get assigned to.
     */
    public Builder companyLocationIdReference(String variableRef) {
      this.variableReferences.put("companyLocationId", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ID"))).build());
      this.fieldsSet.add("companyLocationId");
      return this;
    }

    /**
     * The unique tax registration ID for the company location.
     */
    public Builder taxRegistrationId(String taxRegistrationId) {
      this.taxRegistrationId = taxRegistrationId;
      this.fieldsSet.add("taxRegistrationId");
      return this;
    }

    /**
     * The unique tax registration ID for the company location.
     */
    public Builder taxRegistrationIdReference(String variableRef) {
      this.variableReferences.put("taxRegistrationId", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.TypeName("String")).build());
      this.fieldsSet.add("taxRegistrationId");
      return this;
    }

    /**
     * Whether the location is exempt from taxes.
     */
    public Builder taxExempt(Boolean taxExempt) {
      this.taxExempt = taxExempt;
      this.fieldsSet.add("taxExempt");
      return this;
    }

    /**
     * Whether the location is exempt from taxes.
     */
    public Builder taxExemptReference(String variableRef) {
      this.variableReferences.put("taxExempt", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.TypeName("Boolean")).build());
      this.fieldsSet.add("taxExempt");
      return this;
    }

    /**
     * The list of tax exemptions to assign to the company location.
     */
    public Builder exemptionsToAssign(List<TaxExemption> exemptionsToAssign) {
      this.exemptionsToAssign = exemptionsToAssign;
      this.fieldsSet.add("exemptionsToAssign");
      return this;
    }

    /**
     * The list of tax exemptions to assign to the company location.
     */
    public Builder exemptionsToAssignReference(String variableRef) {
      this.variableReferences.put("exemptionsToAssign", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.ListType(new graphql.language.NonNullType(new graphql.language.TypeName("TaxExemption")))).build());
      this.fieldsSet.add("exemptionsToAssign");
      return this;
    }

    /**
     * The list of tax exemptions to remove from the company location.
     */
    public Builder exemptionsToRemove(List<TaxExemption> exemptionsToRemove) {
      this.exemptionsToRemove = exemptionsToRemove;
      this.fieldsSet.add("exemptionsToRemove");
      return this;
    }

    /**
     * The list of tax exemptions to remove from the company location.
     */
    public Builder exemptionsToRemoveReference(String variableRef) {
      this.variableReferences.put("exemptionsToRemove", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.ListType(new graphql.language.NonNullType(new graphql.language.TypeName("TaxExemption")))).build());
      this.fieldsSet.add("exemptionsToRemove");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
