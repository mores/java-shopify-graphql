package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.SubscriptionLineUpdateInput;
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
 * Updates a subscription line on a subscription draft.
 */
public class SubscriptionDraftLineUpdateGraphQLQuery extends GraphQLQuery {
  public SubscriptionDraftLineUpdateGraphQLQuery(String draftId, String lineId,
      SubscriptionLineUpdateInput input, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (draftId != null || fieldsSet.contains("draftId")) {
        getInput().put("draftId", draftId);
    }if (lineId != null || fieldsSet.contains("lineId")) {
        getInput().put("lineId", lineId);
    }if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public SubscriptionDraftLineUpdateGraphQLQuery(String draftId, String lineId,
      SubscriptionLineUpdateInput input, String queryName, Set<String> fieldsSet,
      Map<String, String> variableReferences, List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (draftId != null || fieldsSet.contains("draftId")) {
        getInput().put("draftId", draftId);
    }if (lineId != null || fieldsSet.contains("lineId")) {
        getInput().put("lineId", lineId);
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

  public SubscriptionDraftLineUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "subscriptionDraftLineUpdate";
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

    private SubscriptionLineUpdateInput input;

    private String queryName;

    public SubscriptionDraftLineUpdateGraphQLQuery build() {
      return new SubscriptionDraftLineUpdateGraphQLQuery(draftId, lineId, input, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The gid of the Subscription Contract draft to update a subscription line from.
     */
    public Builder draftId(String draftId) {
      this.draftId = draftId;
      this.fieldsSet.add("draftId");
      return this;
    }

    /**
     * The gid of the Subscription Contract draft to update a subscription line from.
     */
    public Builder draftIdReference(String variableRef) {
      this.variableReferences.put("draftId", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ID"))).build());
      this.fieldsSet.add("draftId");
      return this;
    }

    /**
     * The gid of the Subscription Line to update.
     */
    public Builder lineId(String lineId) {
      this.lineId = lineId;
      this.fieldsSet.add("lineId");
      return this;
    }

    /**
     * The gid of the Subscription Line to update.
     */
    public Builder lineIdReference(String variableRef) {
      this.variableReferences.put("lineId", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ID"))).build());
      this.fieldsSet.add("lineId");
      return this;
    }

    /**
     * The properties of the new Subscription Line.
     */
    public Builder input(SubscriptionLineUpdateInput input) {
      this.input = input;
      this.fieldsSet.add("input");
      return this;
    }

    /**
     * The properties of the new Subscription Line.
     */
    public Builder inputReference(String variableRef) {
      this.variableReferences.put("input", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("SubscriptionLineUpdateInput"))).build());
      this.fieldsSet.add("input");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
