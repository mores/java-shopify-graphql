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
 * Assigns tax exemptions to the company location.
 */
public class CompanyLocationAssignTaxExemptionsGraphQLQuery extends GraphQLQuery {
  public CompanyLocationAssignTaxExemptionsGraphQLQuery(String companyLocationId,
      List<TaxExemption> taxExemptions, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (companyLocationId != null || fieldsSet.contains("companyLocationId")) {
        getInput().put("companyLocationId", companyLocationId);
    }if (taxExemptions != null || fieldsSet.contains("taxExemptions")) {
        getInput().put("taxExemptions", taxExemptions);
    }
  }

  public CompanyLocationAssignTaxExemptionsGraphQLQuery(String companyLocationId,
      List<TaxExemption> taxExemptions, String queryName, Set<String> fieldsSet,
      Map<String, String> variableReferences, List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (companyLocationId != null || fieldsSet.contains("companyLocationId")) {
        getInput().put("companyLocationId", companyLocationId);
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

  public CompanyLocationAssignTaxExemptionsGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "companyLocationAssignTaxExemptions";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String companyLocationId;

    private List<TaxExemption> taxExemptions;

    private String queryName;

    public CompanyLocationAssignTaxExemptionsGraphQLQuery build() {
      return new CompanyLocationAssignTaxExemptionsGraphQLQuery(companyLocationId, taxExemptions, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The location to which the tax exemptions will be assigned.
     */
    public Builder companyLocationId(String companyLocationId) {
      this.companyLocationId = companyLocationId;
      this.fieldsSet.add("companyLocationId");
      return this;
    }

    /**
     * The location to which the tax exemptions will be assigned.
     */
    public Builder companyLocationIdReference(String variableRef) {
      this.variableReferences.put("companyLocationId", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ID"))).build());
      this.fieldsSet.add("companyLocationId");
      return this;
    }

    /**
     * The tax exemptions that are being assigned to the location.
     */
    public Builder taxExemptions(List<TaxExemption> taxExemptions) {
      this.taxExemptions = taxExemptions;
      this.fieldsSet.add("taxExemptions");
      return this;
    }

    /**
     * The tax exemptions that are being assigned to the location.
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
