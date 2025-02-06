package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
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

    private String brandedPromiseHandle;

    private List<String> ownersToAdd;

    private List<String> ownersToRemove;

    private String queryName;

    public DeliveryPromiseParticipantsUpdateGraphQLQuery build() {
      return new DeliveryPromiseParticipantsUpdateGraphQLQuery(brandedPromiseHandle, ownersToAdd, ownersToRemove, queryName, fieldsSet);
               
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
     * The owners to add to the delivery promise participants.
     */
    public Builder ownersToAdd(List<String> ownersToAdd) {
      this.ownersToAdd = ownersToAdd;
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

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
