package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.ChildProductRelationInput;
import com.shopify.types.OptionAndValueInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class CombinedListingUpdateGraphQLQuery extends GraphQLQuery {
  public CombinedListingUpdateGraphQLQuery(String parentProductId, String title,
      List<ChildProductRelationInput> productsAdded, List<ChildProductRelationInput> productsEdited,
      List<String> productsRemovedIds, List<OptionAndValueInput> optionsAndValues, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (parentProductId != null || fieldsSet.contains("parentProductId")) {
        getInput().put("parentProductId", parentProductId);
    }if (title != null || fieldsSet.contains("title")) {
        getInput().put("title", title);
    }if (productsAdded != null || fieldsSet.contains("productsAdded")) {
        getInput().put("productsAdded", productsAdded);
    }if (productsEdited != null || fieldsSet.contains("productsEdited")) {
        getInput().put("productsEdited", productsEdited);
    }if (productsRemovedIds != null || fieldsSet.contains("productsRemovedIds")) {
        getInput().put("productsRemovedIds", productsRemovedIds);
    }if (optionsAndValues != null || fieldsSet.contains("optionsAndValues")) {
        getInput().put("optionsAndValues", optionsAndValues);
    }
  }

  public CombinedListingUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "combinedListingUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String parentProductId;

    private String title;

    private List<ChildProductRelationInput> productsAdded;

    private List<ChildProductRelationInput> productsEdited;

    private List<String> productsRemovedIds;

    private List<OptionAndValueInput> optionsAndValues;

    private String queryName;

    public CombinedListingUpdateGraphQLQuery build() {
      return new CombinedListingUpdateGraphQLQuery(parentProductId, title, productsAdded, productsEdited, productsRemovedIds, optionsAndValues, queryName, fieldsSet);
               
    }

    
    public Builder parentProductId(String parentProductId) {
      this.parentProductId = parentProductId;
      this.fieldsSet.add("parentProductId");
      return this;
    }

    
    public Builder title(String title) {
      this.title = title;
      this.fieldsSet.add("title");
      return this;
    }

    
    public Builder productsAdded(List<ChildProductRelationInput> productsAdded) {
      this.productsAdded = productsAdded;
      this.fieldsSet.add("productsAdded");
      return this;
    }

    
    public Builder productsEdited(List<ChildProductRelationInput> productsEdited) {
      this.productsEdited = productsEdited;
      this.fieldsSet.add("productsEdited");
      return this;
    }

    
    public Builder productsRemovedIds(List<String> productsRemovedIds) {
      this.productsRemovedIds = productsRemovedIds;
      this.fieldsSet.add("productsRemovedIds");
      return this;
    }

    
    public Builder optionsAndValues(List<OptionAndValueInput> optionsAndValues) {
      this.optionsAndValues = optionsAndValues;
      this.fieldsSet.add("optionsAndValues");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
