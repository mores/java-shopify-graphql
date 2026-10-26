package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.CompanyLocationUpdateInput;
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
 * Updates a company location's information and B2B checkout settings. Company
 * locations are branches or offices where [`CompanyContact`](https://shopify.dev/docs/api/admin-graphql/latest/objects/CompanyContact)
 * members place orders on behalf of the company. Contacts must be assigned to a
 * location through `roleAssignments` to place orders.
 *   
 * The mutation modifies details such as the location's name, contact
 * information, preferred locale, and internal notes. You can also configure the
 * B2B checkout experience through [`BuyerExperienceConfiguration`](https://shopify.dev/docs/api/admin-graphql/latest/objects/BuyerExperienceConfiguration)
 * settings that control whether orders require merchant review, [`PaymentTermsTemplate`](https://shopify.dev/docs/api/admin-graphql/latest/objects/PaymentTermsTemplate)
 * settings, shipping address editing permissions, and [`DepositConfiguration`](https://shopify.dev/docs/api/admin-graphql/latest/unions/DepositConfiguration) requirements.
 *   
 * Learn more about [managing company locations](https://shopify.dev/docs/apps/build/b2b/manage-client-company-locations).
 */
public class CompanyLocationUpdateGraphQLQuery extends GraphQLQuery {
  public CompanyLocationUpdateGraphQLQuery(String companyLocationId,
      CompanyLocationUpdateInput input, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (companyLocationId != null || fieldsSet.contains("companyLocationId")) {
        getInput().put("companyLocationId", companyLocationId);
    }if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public CompanyLocationUpdateGraphQLQuery(String companyLocationId,
      CompanyLocationUpdateInput input, String queryName, Set<String> fieldsSet,
      Map<String, String> variableReferences, List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (companyLocationId != null || fieldsSet.contains("companyLocationId")) {
        getInput().put("companyLocationId", companyLocationId);
    }if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public CompanyLocationUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "companyLocationUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String companyLocationId;

    private CompanyLocationUpdateInput input;

    private String queryName;

    public CompanyLocationUpdateGraphQLQuery build() {
      return new CompanyLocationUpdateGraphQLQuery(companyLocationId, input, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The ID of the company location to update.
     */
    public Builder companyLocationId(String companyLocationId) {
      this.companyLocationId = companyLocationId;
      this.fieldsSet.add("companyLocationId");
      return this;
    }

    /**
     * The ID of the company location to update.
     */
    public Builder companyLocationIdReference(String variableRef) {
      this.variableReferences.put("companyLocationId", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ID"))).build());
      this.fieldsSet.add("companyLocationId");
      return this;
    }

    /**
     * The input fields to update in the company location.
     */
    public Builder input(CompanyLocationUpdateInput input) {
      this.input = input;
      this.fieldsSet.add("input");
      return this;
    }

    /**
     * The input fields to update in the company location.
     */
    public Builder inputReference(String variableRef) {
      this.variableReferences.put("input", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("CompanyLocationUpdateInput"))).build());
      this.fieldsSet.add("input");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
