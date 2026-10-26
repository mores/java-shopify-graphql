package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.ValidationUpdateInput;
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
 * Updates a cart and checkout validation. Use `validationUpdate` to rename it,
 * toggle whether it's enabled at checkout, change its `blockOnFailure` behavior,
 * or update its metafields.
 *   
 * Validation errors always block checkout progress. The `blockOnFailure` field
 * controls whether runtime exceptions, such as timeouts, also block checkout.
 */
public class ValidationUpdateGraphQLQuery extends GraphQLQuery {
  public ValidationUpdateGraphQLQuery(ValidationUpdateInput validation, String id, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (validation != null || fieldsSet.contains("validation")) {
        getInput().put("validation", validation);
    }if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }
  }

  public ValidationUpdateGraphQLQuery(ValidationUpdateInput validation, String id, String queryName,
      Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (validation != null || fieldsSet.contains("validation")) {
        getInput().put("validation", validation);
    }if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public ValidationUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "validationUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private ValidationUpdateInput validation;

    private String id;

    private String queryName;

    public ValidationUpdateGraphQLQuery build() {
      return new ValidationUpdateGraphQLQuery(validation, id, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The input fields to update a validation.
     */
    public Builder validation(ValidationUpdateInput validation) {
      this.validation = validation;
      this.fieldsSet.add("validation");
      return this;
    }

    /**
     * The input fields to update a validation.
     */
    public Builder validationReference(String variableRef) {
      this.variableReferences.put("validation", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ValidationUpdateInput"))).build());
      this.fieldsSet.add("validation");
      return this;
    }

    /**
     * The ID representing the validation to update.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The ID representing the validation to update.
     */
    public Builder idReference(String variableRef) {
      this.variableReferences.put("id", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ID"))).build());
      this.fieldsSet.add("id");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
