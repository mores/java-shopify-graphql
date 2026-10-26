package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.TaxExemption;
import graphql.language.VariableDefinition;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Add tax exemptions for the customer.
 */
public class CustomerAddTaxExemptionsGraphQLQuery extends GraphQLQuery {
  public CustomerAddTaxExemptionsGraphQLQuery(String customerId, List<TaxExemption> taxExemptions,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (customerId != null || fieldsSet.contains("customerId")) {
        getInput().put("customerId", customerId);
    }if (taxExemptions != null || fieldsSet.contains("taxExemptions")) {
        getInput().put("taxExemptions", taxExemptions);
    }
  }

  public CustomerAddTaxExemptionsGraphQLQuery(String customerId, List<TaxExemption> taxExemptions,
      String queryName, Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (customerId != null || fieldsSet.contains("customerId")) {
        getInput().put("customerId", customerId);
    }if (taxExemptions != null || fieldsSet.contains("taxExemptions")) {
        getInput().put("taxExemptions", taxExemptions);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public CustomerAddTaxExemptionsGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "customerAddTaxExemptions";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String customerId;

    private List<TaxExemption> taxExemptions;

    private String queryName;

    public CustomerAddTaxExemptionsGraphQLQuery build() {
      return new CustomerAddTaxExemptionsGraphQLQuery(customerId, taxExemptions, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The ID of the customer to update.
     */
    public Builder customerId(String customerId) {
      this.customerId = customerId;
      this.fieldsSet.add("customerId");
      return this;
    }

    /**
     * The ID of the customer to update.
     */
    public Builder customerIdReference(String variableRef) {
      this.variableReferences.put("customerId", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ID"))).build());
      this.fieldsSet.add("customerId");
      return this;
    }

    /**
     * The list of tax exemptions to add for the customer, in the format of an
     * array or a comma-separated list. Example values:
     * `["CA_BC_RESELLER_EXEMPTION", "CA_STATUS_CARD_EXEMPTION"]`,
     * `"CA_BC_RESELLER_EXEMPTION, CA_STATUS_CARD_EXEMPTION"`.
     */
    public Builder taxExemptions(List<TaxExemption> taxExemptions) {
      this.taxExemptions = taxExemptions;
      this.fieldsSet.add("taxExemptions");
      return this;
    }

    /**
     * The list of tax exemptions to add for the customer, in the format of an
     * array or a comma-separated list. Example values:
     * `["CA_BC_RESELLER_EXEMPTION", "CA_STATUS_CARD_EXEMPTION"]`,
     * `"CA_BC_RESELLER_EXEMPTION, CA_STATUS_CARD_EXEMPTION"`.
     */
    public Builder taxExemptionsReference(String variableRef) {
      this.variableReferences.put("taxExemptions", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.ListType(new graphql.language.NonNullType(new graphql.language.TypeName("TaxExemption"))))).build());
      this.fieldsSet.add("taxExemptions");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
