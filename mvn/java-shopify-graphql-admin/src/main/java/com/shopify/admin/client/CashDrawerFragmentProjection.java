package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.admin.types.CashActivitiesSortKeys;
import com.shopify.admin.types.CashDrawerDateRangeInput;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;

public class CashDrawerFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public CashDrawerFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CashDrawer"));
  }

  public CashDrawerFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CashActivityConnectionProjection<CashDrawerFragmentProjection<PARENT, ROOT>, ROOT> cashActivities(
      ) {
     CashActivityConnectionProjection<CashDrawerFragmentProjection<PARENT, ROOT>, ROOT> projection = new CashActivityConnectionProjection<>(this, getRoot());
     getFields().put("cashActivities", projection);
     return projection;
  }

  public CashActivityConnectionProjection<CashDrawerFragmentProjection<PARENT, ROOT>, ROOT> cashActivities(
      Integer first, String after, Integer last, String before, Boolean reverse,
      CashActivitiesSortKeys sortKey, String query, String staffMemberId) {
    CashActivityConnectionProjection<CashDrawerFragmentProjection<PARENT, ROOT>, ROOT> projection = new CashActivityConnectionProjection<>(this, getRoot());    
    getFields().put("cashActivities", projection);
    getInputArguments().computeIfAbsent("cashActivities", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("cashActivities").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("cashActivities").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("cashActivities").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("cashActivities").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("cashActivities").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("cashActivities").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("cashActivities").add(queryArg);
    InputArgument staffMemberIdArg = new InputArgument("staffMemberId", staffMemberId);
    getInputArguments().get("cashActivities").add(staffMemberIdArg);
    return projection;
  }

  public LocationProjection<CashDrawerFragmentProjection<PARENT, ROOT>, ROOT> location() {
     LocationProjection<CashDrawerFragmentProjection<PARENT, ROOT>, ROOT> projection = new LocationProjection<>(this, getRoot());
     getFields().put("location", projection);
     return projection;
  }

  public MoneyV2Projection<CashDrawerFragmentProjection<PARENT, ROOT>, ROOT> netSales() {
     MoneyV2Projection<CashDrawerFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("netSales", projection);
     return projection;
  }

  public MoneyV2Projection<CashDrawerFragmentProjection<PARENT, ROOT>, ROOT> netSales(
      CashDrawerDateRangeInput dateRange) {
    MoneyV2Projection<CashDrawerFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());    
    getFields().put("netSales", projection);
    getInputArguments().computeIfAbsent("netSales", k -> new ArrayList<>());                      
    InputArgument dateRangeArg = new InputArgument("dateRange", dateRange);
    getInputArguments().get("netSales").add(dateRangeArg);
    return projection;
  }

  public PointOfSaleDeviceConnectionProjection<CashDrawerFragmentProjection<PARENT, ROOT>, ROOT> pointOfSaleDevices(
      ) {
     PointOfSaleDeviceConnectionProjection<CashDrawerFragmentProjection<PARENT, ROOT>, ROOT> projection = new PointOfSaleDeviceConnectionProjection<>(this, getRoot());
     getFields().put("pointOfSaleDevices", projection);
     return projection;
  }

  public PointOfSaleDeviceConnectionProjection<CashDrawerFragmentProjection<PARENT, ROOT>, ROOT> pointOfSaleDevices(
      Integer first, String after, Integer last, String before) {
    PointOfSaleDeviceConnectionProjection<CashDrawerFragmentProjection<PARENT, ROOT>, ROOT> projection = new PointOfSaleDeviceConnectionProjection<>(this, getRoot());    
    getFields().put("pointOfSaleDevices", projection);
    getInputArguments().computeIfAbsent("pointOfSaleDevices", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("pointOfSaleDevices").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("pointOfSaleDevices").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("pointOfSaleDevices").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("pointOfSaleDevices").add(beforeArg);
    return projection;
  }

  public MoneyV2Projection<CashDrawerFragmentProjection<PARENT, ROOT>, ROOT> totalAdjustments() {
     MoneyV2Projection<CashDrawerFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("totalAdjustments", projection);
     return projection;
  }

  public MoneyV2Projection<CashDrawerFragmentProjection<PARENT, ROOT>, ROOT> totalAdjustments(
      CashDrawerDateRangeInput dateRange) {
    MoneyV2Projection<CashDrawerFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());    
    getFields().put("totalAdjustments", projection);
    getInputArguments().computeIfAbsent("totalAdjustments", k -> new ArrayList<>());                      
    InputArgument dateRangeArg = new InputArgument("dateRange", dateRange);
    getInputArguments().get("totalAdjustments").add(dateRangeArg);
    return projection;
  }

  public MoneyV2Projection<CashDrawerFragmentProjection<PARENT, ROOT>, ROOT> totalDiscrepancies() {
     MoneyV2Projection<CashDrawerFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("totalDiscrepancies", projection);
     return projection;
  }

  public MoneyV2Projection<CashDrawerFragmentProjection<PARENT, ROOT>, ROOT> totalDiscrepancies(
      CashDrawerDateRangeInput dateRange) {
    MoneyV2Projection<CashDrawerFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());    
    getFields().put("totalDiscrepancies", projection);
    getInputArguments().computeIfAbsent("totalDiscrepancies", k -> new ArrayList<>());                      
    InputArgument dateRangeArg = new InputArgument("dateRange", dateRange);
    getInputArguments().get("totalDiscrepancies").add(dateRangeArg);
    return projection;
  }

  public MoneyV2Projection<CashDrawerFragmentProjection<PARENT, ROOT>, ROOT> totalRefunds() {
     MoneyV2Projection<CashDrawerFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("totalRefunds", projection);
     return projection;
  }

  public MoneyV2Projection<CashDrawerFragmentProjection<PARENT, ROOT>, ROOT> totalRefunds(
      CashDrawerDateRangeInput dateRange) {
    MoneyV2Projection<CashDrawerFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());    
    getFields().put("totalRefunds", projection);
    getInputArguments().computeIfAbsent("totalRefunds", k -> new ArrayList<>());                      
    InputArgument dateRangeArg = new InputArgument("dateRange", dateRange);
    getInputArguments().get("totalRefunds").add(dateRangeArg);
    return projection;
  }

  public MoneyV2Projection<CashDrawerFragmentProjection<PARENT, ROOT>, ROOT> totalSales() {
     MoneyV2Projection<CashDrawerFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("totalSales", projection);
     return projection;
  }

  public MoneyV2Projection<CashDrawerFragmentProjection<PARENT, ROOT>, ROOT> totalSales(
      CashDrawerDateRangeInput dateRange) {
    MoneyV2Projection<CashDrawerFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());    
    getFields().put("totalSales", projection);
    getInputArguments().computeIfAbsent("totalSales", k -> new ArrayList<>());                      
    InputArgument dateRangeArg = new InputArgument("dateRange", dateRange);
    getInputArguments().get("totalSales").add(dateRangeArg);
    return projection;
  }

  public CashDrawerFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public CashDrawerFragmentProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on CashDrawer {");
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
