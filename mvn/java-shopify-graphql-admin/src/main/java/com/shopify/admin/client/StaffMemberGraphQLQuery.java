package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
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
 * Retrieves a [staff
 * member](https://shopify.dev/docs/api/admin-graphql/latest/objects/StaffMember)
 * by ID. If no ID is provided, the query returns the staff member that's making
 * the request. A staff member is a user who can access the Shopify admin to
 * manage store operations.
 *   
 * Provides staff member details such as email, name, and shop owner status. When
 * querying the current user (with or without an ID), additional [private data](https://shopify.dev/docs/api/admin-graphql/latest/queries/staffMember#returns-StaffMember.fields.privateData)
 * becomes available.
 */
public class StaffMemberGraphQLQuery extends GraphQLQuery {
  public StaffMemberGraphQLQuery(String id, String queryName, Set<String> fieldsSet) {
    super("query", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }
  }

  public StaffMemberGraphQLQuery(String id, String queryName, Set<String> fieldsSet,
      Map<String, String> variableReferences, List<VariableDefinition> variableDefinitions) {
    super("query", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public StaffMemberGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "staffMember";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String id;

    private String queryName;

    public StaffMemberGraphQLQuery build() {
      return new StaffMemberGraphQLQuery(id, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The ID of the staff member to return. If no ID is provided, then the staff member making the query (if any) is returned.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The ID of the staff member to return. If no ID is provided, then the staff member making the query (if any) is returned.
     */
    public Builder idReference(String variableRef) {
      this.variableReferences.put("id", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.TypeName("ID")).build());
      this.fieldsSet.add("id");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
