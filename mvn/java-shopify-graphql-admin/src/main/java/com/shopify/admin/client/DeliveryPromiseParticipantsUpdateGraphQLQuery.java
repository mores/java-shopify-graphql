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
 * Updates the delivery promise participants by adding or removing owners based on a branded promise handle.
 */
public class DeliveryPromiseParticipantsUpdateGraphQLQuery extends GraphQLQuery {
  public DeliveryPromiseParticipantsUpdateGraphQLQuery(String brandedPromiseHandle,
      List<String> ownersToAdd, List<String> ownersToRemove, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (brandedPromiseHandle != null || fieldsSet.contains("brandedPromiseHandle")) {
        getInput().put("brandedPromiseHandle", brandedPromiseHandle);
    }if (ownersToAdd != null || fieldsSet.contains("ownersToAdd")) {
        getInput().put("ownersToAdd", ownersToAdd);
    }if (ownersToRemove != null || fieldsSet.contains("ownersToRemove")) {
        getInput().put("ownersToRemove", ownersToRemove);
    }
  }

  public DeliveryPromiseParticipantsUpdateGraphQLQuery(String brandedPromiseHandle,
      List<String> ownersToAdd, List<String> ownersToRemove, String queryName,
      Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (brandedPromiseHandle != null || fieldsSet.contains("brandedPromiseHandle")) {
        getInput().put("brandedPromiseHandle", brandedPromiseHandle);
    }if (ownersToAdd != null || fieldsSet.contains("ownersToAdd")) {
        getInput().put("ownersToAdd", ownersToAdd);
    }if (ownersToRemove != null || fieldsSet.contains("ownersToRemove")) {
        getInput().put("ownersToRemove", ownersToRemove);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public DeliveryPromiseParticipantsUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "deliveryPromiseParticipantsUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String brandedPromiseHandle;

    private List<String> ownersToAdd;

    private List<String> ownersToRemove;

    private String queryName;

    public DeliveryPromiseParticipantsUpdateGraphQLQuery build() {
      return new DeliveryPromiseParticipantsUpdateGraphQLQuery(brandedPromiseHandle, ownersToAdd, ownersToRemove, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The branded promise handle to update the delivery promise participants for.
     */
    public Builder brandedPromiseHandle(String brandedPromiseHandle) {
      this.brandedPromiseHandle = brandedPromiseHandle;
      this.fieldsSet.add("brandedPromiseHandle");
      return this;
    }

    /**
     * The branded promise handle to update the delivery promise participants for.
     */
    public Builder brandedPromiseHandleReference(String variableRef) {
      this.variableReferences.put("brandedPromiseHandle", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("String"))).build());
      this.fieldsSet.add("brandedPromiseHandle");
      return this;
    }

    /**
     * The owners to add to the delivery promise participants.
     */
    public Builder ownersToAdd(List<String> ownersToAdd) {
      this.ownersToAdd = ownersToAdd;
      this.fieldsSet.add("ownersToAdd");
      return this;
    }

    /**
     * The owners to add to the delivery promise participants.
     */
    public Builder ownersToAddReference(String variableRef) {
      this.variableReferences.put("ownersToAdd", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.ListType(new graphql.language.NonNullType(new graphql.language.TypeName("ID")))).build());
      this.fieldsSet.add("ownersToAdd");
      return this;
    }

    /**
     * The owners to remove from the delivery promise participants.
     */
    public Builder ownersToRemove(List<String> ownersToRemove) {
      this.ownersToRemove = ownersToRemove;
      this.fieldsSet.add("ownersToRemove");
      return this;
    }

    /**
     * The owners to remove from the delivery promise participants.
     */
    public Builder ownersToRemoveReference(String variableRef) {
      this.variableReferences.put("ownersToRemove", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.ListType(new graphql.language.NonNullType(new graphql.language.TypeName("ID")))).build());
      this.fieldsSet.add("ownersToRemove");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
