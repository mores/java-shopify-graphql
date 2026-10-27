package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.ValidationCreateInput;
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
 * Creates a cart and checkout validation: a server-side rule enforced before a
 * customer can complete checkout. Each validation is powered by a cart and
 * checkout validation function that you provide using `functionId` or
 * `functionHandle`.
 *   
 * Use `validationCreate` to apply custom rules at checkout, such as limiting
 * item quantities, enforcing order minimums or maximums, or blocking checkout
 * for restricted shipping addresses. Validations run on Shopify's servers and
 * are enforced throughout checkout, so they can't be bypassed by the client.
 *   
 * Validation errors always block checkout progress. The `blockOnFailure` field
 * controls whether runtime exceptions, such as timeouts, also block checkout.
 */
public class ValidationCreateGraphQLQuery extends GraphQLQuery {
  public ValidationCreateGraphQLQuery(ValidationCreateInput validation, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (validation != null || fieldsSet.contains("validation")) {
        getInput().put("validation", validation);
    }
  }

  public ValidationCreateGraphQLQuery(ValidationCreateInput validation, String queryName,
      Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (validation != null || fieldsSet.contains("validation")) {
        getInput().put("validation", validation);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public ValidationCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "validationCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private ValidationCreateInput validation;

    private String queryName;

    public ValidationCreateGraphQLQuery build() {
      return new ValidationCreateGraphQLQuery(validation, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The input fields for a new validation.
     */
    public Builder validation(ValidationCreateInput validation) {
      this.validation = validation;
      this.fieldsSet.add("validation");
      return this;
    }

    /**
     * The input fields for a new validation.
     */
    public Builder validationReference(String variableRef) {
      this.variableReferences.put("validation", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ValidationCreateInput"))).build());
      this.fieldsSet.add("validation");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
