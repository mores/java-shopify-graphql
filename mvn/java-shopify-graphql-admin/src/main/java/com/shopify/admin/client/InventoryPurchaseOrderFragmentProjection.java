package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.admin.types.PurchaseOrderLineItemSortKeys;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;

public class InventoryPurchaseOrderFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public InventoryPurchaseOrderFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("InventoryPurchaseOrder"));
  }

  public InventoryPurchaseOrderFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CurrencyCodeProjection<InventoryPurchaseOrderFragmentProjection<PARENT, ROOT>, ROOT> currency(
      ) {
     CurrencyCodeProjection<InventoryPurchaseOrderFragmentProjection<PARENT, ROOT>, ROOT> projection = new CurrencyCodeProjection<>(this, getRoot());
     getFields().put("currency", projection);
     return projection;
  }

  public LocationSnapshotProjection<InventoryPurchaseOrderFragmentProjection<PARENT, ROOT>, ROOT> destination(
      ) {
     LocationSnapshotProjection<InventoryPurchaseOrderFragmentProjection<PARENT, ROOT>, ROOT> projection = new LocationSnapshotProjection<>(this, getRoot());
     getFields().put("destination", projection);
     return projection;
  }

  public InventoryPurchaseOrderLineItemConnectionProjection<InventoryPurchaseOrderFragmentProjection<PARENT, ROOT>, ROOT> lineItems(
      ) {
     InventoryPurchaseOrderLineItemConnectionProjection<InventoryPurchaseOrderFragmentProjection<PARENT, ROOT>, ROOT> projection = new InventoryPurchaseOrderLineItemConnectionProjection<>(this, getRoot());
     getFields().put("lineItems", projection);
     return projection;
  }

  public InventoryPurchaseOrderLineItemConnectionProjection<InventoryPurchaseOrderFragmentProjection<PARENT, ROOT>, ROOT> lineItems(
      String lineItemId, Integer first, String after, Integer last, String before, Boolean reverse,
      PurchaseOrderLineItemSortKeys sortKey, String query) {
    InventoryPurchaseOrderLineItemConnectionProjection<InventoryPurchaseOrderFragmentProjection<PARENT, ROOT>, ROOT> projection = new InventoryPurchaseOrderLineItemConnectionProjection<>(this, getRoot());    
    getFields().put("lineItems", projection);
    getInputArguments().computeIfAbsent("lineItems", k -> new ArrayList<>());                      
    InputArgument lineItemIdArg = new InputArgument("lineItemId", lineItemId, false, null);
    getInputArguments().get("lineItems").add(lineItemIdArg);
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("lineItems").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("lineItems").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("lineItems").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("lineItems").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("lineItems").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey, false, null);
    getInputArguments().get("lineItems").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query, false, null);
    getInputArguments().get("lineItems").add(queryArg);
    return projection;
  }

  public InventoryPurchaseOrderLineItemConnectionProjection<InventoryPurchaseOrderFragmentProjection<PARENT, ROOT>, ROOT> lineItemsWithVariableReferences(
      String lineItemIdReference, String firstReference, String afterReference,
      String lastReference, String beforeReference, String reverseReference,
      String sortKeyReference, String queryReference) {
    InventoryPurchaseOrderLineItemConnectionProjection<InventoryPurchaseOrderFragmentProjection<PARENT, ROOT>, ROOT> projection = new InventoryPurchaseOrderLineItemConnectionProjection<>(this, getRoot());    
    getFields().put("lineItems", projection);
    getInputArguments().computeIfAbsent("lineItems", k -> new ArrayList<>());              
    InputArgument lineItemIdArg = new InputArgument("lineItemId", lineItemIdReference, true, new graphql.language.TypeName("ID"));
    getInputArguments().get("lineItems").add(lineItemIdArg);
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("lineItems").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("lineItems").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("lineItems").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("lineItems").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("lineItems").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKeyReference, true, new graphql.language.TypeName("PurchaseOrderLineItemSortKeys"));
    getInputArguments().get("lineItems").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", queryReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("lineItems").add(queryArg);
    return projection;
  }

  public InventorySupplierSnapshotProjection<InventoryPurchaseOrderFragmentProjection<PARENT, ROOT>, ROOT> origin(
      ) {
     InventorySupplierSnapshotProjection<InventoryPurchaseOrderFragmentProjection<PARENT, ROOT>, ROOT> projection = new InventorySupplierSnapshotProjection<>(this, getRoot());
     getFields().put("origin", projection);
     return projection;
  }

  public InventoryPurchaseOrderStatusProjection<InventoryPurchaseOrderFragmentProjection<PARENT, ROOT>, ROOT> status(
      ) {
     InventoryPurchaseOrderStatusProjection<InventoryPurchaseOrderFragmentProjection<PARENT, ROOT>, ROOT> projection = new InventoryPurchaseOrderStatusProjection<>(this, getRoot());
     getFields().put("status", projection);
     return projection;
  }

  public InventoryTransferConnectionProjection<InventoryPurchaseOrderFragmentProjection<PARENT, ROOT>, ROOT> transfers(
      ) {
     InventoryTransferConnectionProjection<InventoryPurchaseOrderFragmentProjection<PARENT, ROOT>, ROOT> projection = new InventoryTransferConnectionProjection<>(this, getRoot());
     getFields().put("transfers", projection);
     return projection;
  }

  public InventoryTransferConnectionProjection<InventoryPurchaseOrderFragmentProjection<PARENT, ROOT>, ROOT> transfers(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    InventoryTransferConnectionProjection<InventoryPurchaseOrderFragmentProjection<PARENT, ROOT>, ROOT> projection = new InventoryTransferConnectionProjection<>(this, getRoot());    
    getFields().put("transfers", projection);
    getInputArguments().computeIfAbsent("transfers", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("transfers").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("transfers").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("transfers").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("transfers").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("transfers").add(reverseArg);
    return projection;
  }

  public InventoryTransferConnectionProjection<InventoryPurchaseOrderFragmentProjection<PARENT, ROOT>, ROOT> transfersWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference) {
    InventoryTransferConnectionProjection<InventoryPurchaseOrderFragmentProjection<PARENT, ROOT>, ROOT> projection = new InventoryTransferConnectionProjection<>(this, getRoot());    
    getFields().put("transfers", projection);
    getInputArguments().computeIfAbsent("transfers", k -> new ArrayList<>());              
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("transfers").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("transfers").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("transfers").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("transfers").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("transfers").add(reverseArg);
    return projection;
  }

  public InventoryPurchaseOrderFragmentProjection<PARENT, ROOT> archivedAt() {
    getFields().put("archivedAt", null);
    return this;
  }

  public InventoryPurchaseOrderFragmentProjection<PARENT, ROOT> dateCreated() {
    getFields().put("dateCreated", null);
    return this;
  }

  public InventoryPurchaseOrderFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public InventoryPurchaseOrderFragmentProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public InventoryPurchaseOrderFragmentProjection<PARENT, ROOT> orderedAt() {
    getFields().put("orderedAt", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on InventoryPurchaseOrder {");
    getFields().forEach((k, v) -> {
        builder.append(" ").append(k);
        if(v != null) {
            builder.append(" ").append(v.toString());
        }
    });
    builder.append("}");
     
    return builder.toString();
  }
}
