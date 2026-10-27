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
 * Whether a member, which is a customer, belongs to a segment.
 */
public class CustomerSegmentMembershipGraphQLQuery extends GraphQLQuery {
  public CustomerSegmentMembershipGraphQLQuery(List<String> segmentIds, String customerId,
      String queryName, Set<String> fieldsSet) {
    super("query", queryName);
    if (segmentIds != null || fieldsSet.contains("segmentIds")) {
        getInput().put("segmentIds", segmentIds);
    }if (customerId != null || fieldsSet.contains("customerId")) {
        getInput().put("customerId", customerId);
    }
  }

  public CustomerSegmentMembershipGraphQLQuery(List<String> segmentIds, String customerId,
      String queryName, Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("query", queryName);
    if (segmentIds != null || fieldsSet.contains("segmentIds")) {
        getInput().put("segmentIds", segmentIds);
    }if (customerId != null || fieldsSet.contains("customerId")) {
        getInput().put("customerId", customerId);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public CustomerSegmentMembershipGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "customerSegmentMembership";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private List<String> segmentIds;

    private String customerId;

    private String queryName;

    public CustomerSegmentMembershipGraphQLQuery build() {
      return new CustomerSegmentMembershipGraphQLQuery(segmentIds, customerId, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The segments to evaluate for the given customer.
     */
    public Builder segmentIds(List<String> segmentIds) {
      this.segmentIds = segmentIds;
      this.fieldsSet.add("segmentIds");
      return this;
    }

    /**
     * The segments to evaluate for the given customer.
     */
    public Builder segmentIdsReference(String variableRef) {
      this.variableReferences.put("segmentIds", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.ListType(new graphql.language.NonNullType(new graphql.language.TypeName("ID"))))).build());
      this.fieldsSet.add("segmentIds");
      return this;
    }

    /**
     * The ID of the customer that has the membership.
     */
    public Builder customerId(String customerId) {
      this.customerId = customerId;
      this.fieldsSet.add("customerId");
      return this;
    }

    /**
     * The ID of the customer that has the membership.
     */
    public Builder customerIdReference(String variableRef) {
      this.variableReferences.put("customerId", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ID"))).build());
      this.fieldsSet.add("customerId");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
