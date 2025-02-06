package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.types.AppRevenueAttributionRecordSortKeys;
import com.shopify.types.AppSubscriptionSortKeys;
import com.shopify.types.AppTransactionSortKeys;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

public class AppInstallationProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public AppInstallationProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("AppInstallation"));
  }

  public AppInstallationProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AccessScopeProjection<AppInstallationProjection<PARENT, ROOT>, ROOT> accessScopes() {
     AccessScopeProjection<AppInstallationProjection<PARENT, ROOT>, ROOT> projection = new AccessScopeProjection<>(this, getRoot());
     getFields().put("accessScopes", projection);
     return projection;
  }

  public AppSubscriptionProjection<AppInstallationProjection<PARENT, ROOT>, ROOT> activeSubscriptions(
      ) {
     AppSubscriptionProjection<AppInstallationProjection<PARENT, ROOT>, ROOT> projection = new AppSubscriptionProjection<>(this, getRoot());
     getFields().put("activeSubscriptions", projection);
     return projection;
  }

  public AppSubscriptionConnectionProjection<AppInstallationProjection<PARENT, ROOT>, ROOT> allSubscriptions(
      ) {
     AppSubscriptionConnectionProjection<AppInstallationProjection<PARENT, ROOT>, ROOT> projection = new AppSubscriptionConnectionProjection<>(this, getRoot());
     getFields().put("allSubscriptions", projection);
     return projection;
  }

  public AppSubscriptionConnectionProjection<AppInstallationProjection<PARENT, ROOT>, ROOT> allSubscriptions(
      Integer first, String after, Integer last, String before, Boolean reverse,
      AppSubscriptionSortKeys sortKey) {
    AppSubscriptionConnectionProjection<AppInstallationProjection<PARENT, ROOT>, ROOT> projection = new AppSubscriptionConnectionProjection<>(this, getRoot());    
    getFields().put("allSubscriptions", projection);
    getInputArguments().computeIfAbsent("allSubscriptions", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("allSubscriptions").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("allSubscriptions").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("allSubscriptions").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("allSubscriptions").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("allSubscriptions").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("allSubscriptions").add(sortKeyArg);
    return projection;
  }

  public AppProjection<AppInstallationProjection<PARENT, ROOT>, ROOT> app() {
     AppProjection<AppInstallationProjection<PARENT, ROOT>, ROOT> projection = new AppProjection<>(this, getRoot());
     getFields().put("app", projection);
     return projection;
  }

  public ChannelProjection<AppInstallationProjection<PARENT, ROOT>, ROOT> channel() {
     ChannelProjection<AppInstallationProjection<PARENT, ROOT>, ROOT> projection = new ChannelProjection<>(this, getRoot());
     getFields().put("channel", projection);
     return projection;
  }

  public AppCreditConnectionProjection<AppInstallationProjection<PARENT, ROOT>, ROOT> credits() {
     AppCreditConnectionProjection<AppInstallationProjection<PARENT, ROOT>, ROOT> projection = new AppCreditConnectionProjection<>(this, getRoot());
     getFields().put("credits", projection);
     return projection;
  }

  public AppCreditConnectionProjection<AppInstallationProjection<PARENT, ROOT>, ROOT> credits(
      Integer first, String after, Integer last, String before, Boolean reverse,
      AppTransactionSortKeys sortKey) {
    AppCreditConnectionProjection<AppInstallationProjection<PARENT, ROOT>, ROOT> projection = new AppCreditConnectionProjection<>(this, getRoot());    
    getFields().put("credits", projection);
    getInputArguments().computeIfAbsent("credits", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("credits").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("credits").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("credits").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("credits").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("credits").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("credits").add(sortKeyArg);
    return projection;
  }

  public MetafieldProjection<AppInstallationProjection<PARENT, ROOT>, ROOT> metafield() {
     MetafieldProjection<AppInstallationProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());
     getFields().put("metafield", projection);
     return projection;
  }

  public MetafieldProjection<AppInstallationProjection<PARENT, ROOT>, ROOT> metafield(
      String namespace, String key) {
    MetafieldProjection<AppInstallationProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());    
    getFields().put("metafield", projection);
    getInputArguments().computeIfAbsent("metafield", k -> new ArrayList<>());                      
    InputArgument namespaceArg = new InputArgument("namespace", namespace);
    getInputArguments().get("metafield").add(namespaceArg);
    InputArgument keyArg = new InputArgument("key", key);
    getInputArguments().get("metafield").add(keyArg);
    return projection;
  }

  public MetafieldConnectionProjection<AppInstallationProjection<PARENT, ROOT>, ROOT> metafields() {
     MetafieldConnectionProjection<AppInstallationProjection<PARENT, ROOT>, ROOT> projection = new MetafieldConnectionProjection<>(this, getRoot());
     getFields().put("metafields", projection);
     return projection;
  }

  public MetafieldConnectionProjection<AppInstallationProjection<PARENT, ROOT>, ROOT> metafields(
      String namespace, List<String> keys, Integer first, String after, Integer last, String before,
      Boolean reverse) {
    MetafieldConnectionProjection<AppInstallationProjection<PARENT, ROOT>, ROOT> projection = new MetafieldConnectionProjection<>(this, getRoot());    
    getFields().put("metafields", projection);
    getInputArguments().computeIfAbsent("metafields", k -> new ArrayList<>());                      
    InputArgument namespaceArg = new InputArgument("namespace", namespace);
    getInputArguments().get("metafields").add(namespaceArg);
    InputArgument keysArg = new InputArgument("keys", keys);
    getInputArguments().get("metafields").add(keysArg);
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("metafields").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("metafields").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("metafields").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("metafields").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("metafields").add(reverseArg);
    return projection;
  }

  public AppPurchaseOneTimeConnectionProjection<AppInstallationProjection<PARENT, ROOT>, ROOT> oneTimePurchases(
      ) {
     AppPurchaseOneTimeConnectionProjection<AppInstallationProjection<PARENT, ROOT>, ROOT> projection = new AppPurchaseOneTimeConnectionProjection<>(this, getRoot());
     getFields().put("oneTimePurchases", projection);
     return projection;
  }

  public AppPurchaseOneTimeConnectionProjection<AppInstallationProjection<PARENT, ROOT>, ROOT> oneTimePurchases(
      Integer first, String after, Integer last, String before, Boolean reverse,
      AppTransactionSortKeys sortKey) {
    AppPurchaseOneTimeConnectionProjection<AppInstallationProjection<PARENT, ROOT>, ROOT> projection = new AppPurchaseOneTimeConnectionProjection<>(this, getRoot());    
    getFields().put("oneTimePurchases", projection);
    getInputArguments().computeIfAbsent("oneTimePurchases", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("oneTimePurchases").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("oneTimePurchases").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("oneTimePurchases").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("oneTimePurchases").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("oneTimePurchases").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("oneTimePurchases").add(sortKeyArg);
    return projection;
  }

  public PublicationProjection<AppInstallationProjection<PARENT, ROOT>, ROOT> publication() {
     PublicationProjection<AppInstallationProjection<PARENT, ROOT>, ROOT> projection = new PublicationProjection<>(this, getRoot());
     getFields().put("publication", projection);
     return projection;
  }

  public AppRevenueAttributionRecordConnectionProjection<AppInstallationProjection<PARENT, ROOT>, ROOT> revenueAttributionRecords(
      ) {
     AppRevenueAttributionRecordConnectionProjection<AppInstallationProjection<PARENT, ROOT>, ROOT> projection = new AppRevenueAttributionRecordConnectionProjection<>(this, getRoot());
     getFields().put("revenueAttributionRecords", projection);
     return projection;
  }

  public AppRevenueAttributionRecordConnectionProjection<AppInstallationProjection<PARENT, ROOT>, ROOT> revenueAttributionRecords(
      Integer first, String after, Integer last, String before, Boolean reverse,
      AppRevenueAttributionRecordSortKeys sortKey) {
    AppRevenueAttributionRecordConnectionProjection<AppInstallationProjection<PARENT, ROOT>, ROOT> projection = new AppRevenueAttributionRecordConnectionProjection<>(this, getRoot());    
    getFields().put("revenueAttributionRecords", projection);
    getInputArguments().computeIfAbsent("revenueAttributionRecords", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("revenueAttributionRecords").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("revenueAttributionRecords").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("revenueAttributionRecords").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("revenueAttributionRecords").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("revenueAttributionRecords").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("revenueAttributionRecords").add(sortKeyArg);
    return projection;
  }

  public AppSubscriptionProjection<AppInstallationProjection<PARENT, ROOT>, ROOT> subscriptions() {
     AppSubscriptionProjection<AppInstallationProjection<PARENT, ROOT>, ROOT> projection = new AppSubscriptionProjection<>(this, getRoot());
     getFields().put("subscriptions", projection);
     return projection;
  }

  public AppInstallationProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public AppInstallationProjection<PARENT, ROOT> launchUrl() {
    getFields().put("launchUrl", null);
    return this;
  }

  public AppInstallationProjection<PARENT, ROOT> uninstallUrl() {
    getFields().put("uninstallUrl", null);
    return this;
  }
}
