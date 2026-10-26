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
 * Removes a subscription line from a subscription draft.
 */
public class SubscriptionDraftLineRemoveGraphQLQuery extends GraphQLQuery {
  public SubscriptionDraftLineRemoveGraphQLQuery(String draftId, String lineId, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (draftId != null || fieldsSet.contains("draftId")) {
        getInput().put("draftId", draftId);
    }if (lineId != null || fieldsSet.contains("lineId")) {
        getInput().put("lineId", lineId);
    }
  }

  public SubscriptionDraftLineRemoveGraphQLQuery(String draftId, String lineId, String queryName,
      Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (draftId != null || fieldsSet.contains("draftId")) {
        getInput().put("draftId", draftId);
    }if (lineId != null || fieldsSet.contains("lineId")) {
        getInput().put("lineId", lineId);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public SubscriptionDraftLineRemoveGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "subscriptionDraftLineRemove";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String draftId;

    private String lineId;

    private String queryName;

    public SubscriptionDraftLineRemoveGraphQLQuery build() {
      return new SubscriptionDraftLineRemoveGraphQLQuery(draftId, lineId, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The gid of the Subscription Contract draft to remove a subscription line from.
     */
    public Builder draftId(String draftId) {
      this.draftId = draftId;
      this.fieldsSet.add("draftId");
      return this;
    }

    /**
     * The gid of the Subscription Contract draft to remove a subscription line from.
     */
    public Builder draftIdReference(String variableRef) {
      this.variableReferences.put("draftId", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ID"))).build());
      this.fieldsSet.add("draftId");
      return this;
    }

    /**
     * The gid of the Subscription Line to remove.
     */
    public Builder lineId(String lineId) {
      this.lineId = lineId;
      this.fieldsSet.add("lineId");
      return this;
    }

    /**
     * The gid of the Subscription Line to remove.
     */
    public Builder lineIdReference(String variableRef) {
      this.variableReferences.put("lineId", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ID"))).build());
      this.fieldsSet.add("lineId");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
