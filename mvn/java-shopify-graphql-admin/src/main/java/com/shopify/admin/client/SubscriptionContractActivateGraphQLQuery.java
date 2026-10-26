package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.SubscriptionActor;
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
 * Activates a Subscription Contract. Contract status must be either active, paused, or failed.
 */
public class SubscriptionContractActivateGraphQLQuery extends GraphQLQuery {
  public SubscriptionContractActivateGraphQLQuery(SubscriptionActor actor,
      String subscriptionContractId, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (actor != null || fieldsSet.contains("actor")) {
        getInput().put("actor", actor);
    }if (subscriptionContractId != null || fieldsSet.contains("subscriptionContractId")) {
        getInput().put("subscriptionContractId", subscriptionContractId);
    }
  }

  public SubscriptionContractActivateGraphQLQuery(SubscriptionActor actor,
      String subscriptionContractId, String queryName, Set<String> fieldsSet,
      Map<String, String> variableReferences, List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (actor != null || fieldsSet.contains("actor")) {
        getInput().put("actor", actor);
    }if (subscriptionContractId != null || fieldsSet.contains("subscriptionContractId")) {
        getInput().put("subscriptionContractId", subscriptionContractId);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public SubscriptionContractActivateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "subscriptionContractActivate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private SubscriptionActor actor;

    private String subscriptionContractId;

    private String queryName;

    public SubscriptionContractActivateGraphQLQuery build() {
      return new SubscriptionContractActivateGraphQLQuery(actor, subscriptionContractId, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The actor who initiated a subscription action.
     */
    public Builder actor(SubscriptionActor actor) {
      this.actor = actor;
      this.fieldsSet.add("actor");
      return this;
    }

    /**
     * The actor who initiated a subscription action.
     */
    public Builder actorReference(String variableRef) {
      this.variableReferences.put("actor", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.TypeName("SubscriptionActor")).build());
      this.fieldsSet.add("actor");
      return this;
    }

    /**
     * The ID of the Subscription Contract.
     */
    public Builder subscriptionContractId(String subscriptionContractId) {
      this.subscriptionContractId = subscriptionContractId;
      this.fieldsSet.add("subscriptionContractId");
      return this;
    }

    /**
     * The ID of the Subscription Contract.
     */
    public Builder subscriptionContractIdReference(String variableRef) {
      this.variableReferences.put("subscriptionContractId", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ID"))).build());
      this.fieldsSet.add("subscriptionContractId");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
