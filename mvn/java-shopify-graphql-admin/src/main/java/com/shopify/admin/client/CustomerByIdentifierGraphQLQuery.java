package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.CustomerIdentifierInput;
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
 * Return a customer by an identifier.
 */
public class CustomerByIdentifierGraphQLQuery extends GraphQLQuery {
  public CustomerByIdentifierGraphQLQuery(CustomerIdentifierInput identifier, String queryName,
      Set<String> fieldsSet) {
    super("query", queryName);
    if (identifier != null || fieldsSet.contains("identifier")) {
        getInput().put("identifier", identifier);
    }
  }

  public CustomerByIdentifierGraphQLQuery(CustomerIdentifierInput identifier, String queryName,
      Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("query", queryName);
    if (identifier != null || fieldsSet.contains("identifier")) {
        getInput().put("identifier", identifier);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public CustomerByIdentifierGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "customerByIdentifier";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private CustomerIdentifierInput identifier;

    private String queryName;

    public CustomerByIdentifierGraphQLQuery build() {
      return new CustomerByIdentifierGraphQLQuery(identifier, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The identifier of the customer.
     */
    public Builder identifier(CustomerIdentifierInput identifier) {
      this.identifier = identifier;
      this.fieldsSet.add("identifier");
      return this;
    }

    /**
     * The identifier of the customer.
     */
    public Builder identifierReference(String variableRef) {
      this.variableReferences.put("identifier", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("CustomerIdentifierInput"))).build());
      this.fieldsSet.add("identifier");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
