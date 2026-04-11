package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for customizing the components.
 */
public class CheckoutAndAccountsConfigurationBrandingComponentsInput {
  /**
   * The checkboxes customizations.
   */
  private CheckoutAndAccountsConfigurationBrandingCheckboxInput checkbox;

  /**
   * The choice list customizations.
   */
  private CheckoutAndAccountsConfigurationBrandingChoiceListInput choiceList;

  /**
   * The form controls customizations.
   */
  private CheckoutAndAccountsConfigurationBrandingControlInput control;

  /**
   * The divider customizations.
   */
  private CheckoutAndAccountsConfigurationBrandingDividerStyleInput divider;

  /**
   * The favicon.
   */
  private CheckoutAndAccountsConfigurationBrandingImageInput favicon;

  /**
   * The shared customizations.
   */
  private CheckoutAndAccountsConfigurationBrandingSharedInput shared;

  /**
   * The Heading Level 1 customizations.
   */
  private CheckoutAndAccountsConfigurationBrandingHeadingLevelInput headingLevel1;

  /**
   * The Heading Level 2 customizations.
   */
  private CheckoutAndAccountsConfigurationBrandingHeadingLevelInput headingLevel2;

  /**
   * The Heading Level 3 customizations.
   */
  private CheckoutAndAccountsConfigurationBrandingHeadingLevelInput headingLevel3;

  /**
   * The merchandise thumbnails customizations.
   */
  private CheckoutAndAccountsConfigurationBrandingMerchandiseThumbnailInput merchandiseThumbnail;

  /**
   * The primary buttons customizations.
   */
  private CheckoutAndAccountsConfigurationBrandingButtonInput primaryButton;

  /**
   * The secondary buttons customizations.
   */
  private CheckoutAndAccountsConfigurationBrandingButtonInput secondaryButton;

  /**
   * The selects customizations.
   */
  private CheckoutAndAccountsConfigurationBrandingSelectInput select;

  /**
   * The text fields customizations.
   */
  private CheckoutAndAccountsConfigurationBrandingTextFieldInput textField;

  /**
   * The main area customizations.
   */
  private CheckoutAndAccountsConfigurationBrandingMainInput main;

  /**
   * The footer customizations.
   */
  private CheckoutAndAccountsConfigurationBrandingFooterInput footer;

  /**
   * The header customizations.
   */
  private CheckoutAndAccountsConfigurationBrandingHeaderInput header;

  public CheckoutAndAccountsConfigurationBrandingComponentsInput() {
  }

  /**
   * The checkboxes customizations.
   */
  public CheckoutAndAccountsConfigurationBrandingCheckboxInput getCheckbox() {
    return checkbox;
  }

  public void setCheckbox(CheckoutAndAccountsConfigurationBrandingCheckboxInput checkbox) {
    this.checkbox = checkbox;
  }

  /**
   * The choice list customizations.
   */
  public CheckoutAndAccountsConfigurationBrandingChoiceListInput getChoiceList() {
    return choiceList;
  }

  public void setChoiceList(CheckoutAndAccountsConfigurationBrandingChoiceListInput choiceList) {
    this.choiceList = choiceList;
  }

  /**
   * The form controls customizations.
   */
  public CheckoutAndAccountsConfigurationBrandingControlInput getControl() {
    return control;
  }

  public void setControl(CheckoutAndAccountsConfigurationBrandingControlInput control) {
    this.control = control;
  }

  /**
   * The divider customizations.
   */
  public CheckoutAndAccountsConfigurationBrandingDividerStyleInput getDivider() {
    return divider;
  }

  public void setDivider(CheckoutAndAccountsConfigurationBrandingDividerStyleInput divider) {
    this.divider = divider;
  }

  /**
   * The favicon.
   */
  public CheckoutAndAccountsConfigurationBrandingImageInput getFavicon() {
    return favicon;
  }

  public void setFavicon(CheckoutAndAccountsConfigurationBrandingImageInput favicon) {
    this.favicon = favicon;
  }

  /**
   * The shared customizations.
   */
  public CheckoutAndAccountsConfigurationBrandingSharedInput getShared() {
    return shared;
  }

  public void setShared(CheckoutAndAccountsConfigurationBrandingSharedInput shared) {
    this.shared = shared;
  }

  /**
   * The Heading Level 1 customizations.
   */
  public CheckoutAndAccountsConfigurationBrandingHeadingLevelInput getHeadingLevel1() {
    return headingLevel1;
  }

  public void setHeadingLevel1(
      CheckoutAndAccountsConfigurationBrandingHeadingLevelInput headingLevel1) {
    this.headingLevel1 = headingLevel1;
  }

  /**
   * The Heading Level 2 customizations.
   */
  public CheckoutAndAccountsConfigurationBrandingHeadingLevelInput getHeadingLevel2() {
    return headingLevel2;
  }

  public void setHeadingLevel2(
      CheckoutAndAccountsConfigurationBrandingHeadingLevelInput headingLevel2) {
    this.headingLevel2 = headingLevel2;
  }

  /**
   * The Heading Level 3 customizations.
   */
  public CheckoutAndAccountsConfigurationBrandingHeadingLevelInput getHeadingLevel3() {
    return headingLevel3;
  }

  public void setHeadingLevel3(
      CheckoutAndAccountsConfigurationBrandingHeadingLevelInput headingLevel3) {
    this.headingLevel3 = headingLevel3;
  }

  /**
   * The merchandise thumbnails customizations.
   */
  public CheckoutAndAccountsConfigurationBrandingMerchandiseThumbnailInput getMerchandiseThumbnail(
      ) {
    return merchandiseThumbnail;
  }

  public void setMerchandiseThumbnail(
      CheckoutAndAccountsConfigurationBrandingMerchandiseThumbnailInput merchandiseThumbnail) {
    this.merchandiseThumbnail = merchandiseThumbnail;
  }

  /**
   * The primary buttons customizations.
   */
  public CheckoutAndAccountsConfigurationBrandingButtonInput getPrimaryButton() {
    return primaryButton;
  }

  public void setPrimaryButton(CheckoutAndAccountsConfigurationBrandingButtonInput primaryButton) {
    this.primaryButton = primaryButton;
  }

  /**
   * The secondary buttons customizations.
   */
  public CheckoutAndAccountsConfigurationBrandingButtonInput getSecondaryButton() {
    return secondaryButton;
  }

  public void setSecondaryButton(
      CheckoutAndAccountsConfigurationBrandingButtonInput secondaryButton) {
    this.secondaryButton = secondaryButton;
  }

  /**
   * The selects customizations.
   */
  public CheckoutAndAccountsConfigurationBrandingSelectInput getSelect() {
    return select;
  }

  public void setSelect(CheckoutAndAccountsConfigurationBrandingSelectInput select) {
    this.select = select;
  }

  /**
   * The text fields customizations.
   */
  public CheckoutAndAccountsConfigurationBrandingTextFieldInput getTextField() {
    return textField;
  }

  public void setTextField(CheckoutAndAccountsConfigurationBrandingTextFieldInput textField) {
    this.textField = textField;
  }

  /**
   * The main area customizations.
   */
  public CheckoutAndAccountsConfigurationBrandingMainInput getMain() {
    return main;
  }

  public void setMain(CheckoutAndAccountsConfigurationBrandingMainInput main) {
    this.main = main;
  }

  /**
   * The footer customizations.
   */
  public CheckoutAndAccountsConfigurationBrandingFooterInput getFooter() {
    return footer;
  }

  public void setFooter(CheckoutAndAccountsConfigurationBrandingFooterInput footer) {
    this.footer = footer;
  }

  /**
   * The header customizations.
   */
  public CheckoutAndAccountsConfigurationBrandingHeaderInput getHeader() {
    return header;
  }

  public void setHeader(CheckoutAndAccountsConfigurationBrandingHeaderInput header) {
    this.header = header;
  }

  @Override
  public String toString() {
    return "CheckoutAndAccountsConfigurationBrandingComponentsInput{checkbox='" + checkbox + "', choiceList='" + choiceList + "', control='" + control + "', divider='" + divider + "', favicon='" + favicon + "', shared='" + shared + "', headingLevel1='" + headingLevel1 + "', headingLevel2='" + headingLevel2 + "', headingLevel3='" + headingLevel3 + "', merchandiseThumbnail='" + merchandiseThumbnail + "', primaryButton='" + primaryButton + "', secondaryButton='" + secondaryButton + "', select='" + select + "', textField='" + textField + "', main='" + main + "', footer='" + footer + "', header='" + header + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutAndAccountsConfigurationBrandingComponentsInput that = (CheckoutAndAccountsConfigurationBrandingComponentsInput) o;
    return Objects.equals(checkbox, that.checkbox) &&
        Objects.equals(choiceList, that.choiceList) &&
        Objects.equals(control, that.control) &&
        Objects.equals(divider, that.divider) &&
        Objects.equals(favicon, that.favicon) &&
        Objects.equals(shared, that.shared) &&
        Objects.equals(headingLevel1, that.headingLevel1) &&
        Objects.equals(headingLevel2, that.headingLevel2) &&
        Objects.equals(headingLevel3, that.headingLevel3) &&
        Objects.equals(merchandiseThumbnail, that.merchandiseThumbnail) &&
        Objects.equals(primaryButton, that.primaryButton) &&
        Objects.equals(secondaryButton, that.secondaryButton) &&
        Objects.equals(select, that.select) &&
        Objects.equals(textField, that.textField) &&
        Objects.equals(main, that.main) &&
        Objects.equals(footer, that.footer) &&
        Objects.equals(header, that.header);
  }

  @Override
  public int hashCode() {
    return Objects.hash(checkbox, choiceList, control, divider, favicon, shared, headingLevel1, headingLevel2, headingLevel3, merchandiseThumbnail, primaryButton, secondaryButton, select, textField, main, footer, header);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The checkboxes customizations.
     */
    private CheckoutAndAccountsConfigurationBrandingCheckboxInput checkbox;

    /**
     * The choice list customizations.
     */
    private CheckoutAndAccountsConfigurationBrandingChoiceListInput choiceList;

    /**
     * The form controls customizations.
     */
    private CheckoutAndAccountsConfigurationBrandingControlInput control;

    /**
     * The divider customizations.
     */
    private CheckoutAndAccountsConfigurationBrandingDividerStyleInput divider;

    /**
     * The favicon.
     */
    private CheckoutAndAccountsConfigurationBrandingImageInput favicon;

    /**
     * The shared customizations.
     */
    private CheckoutAndAccountsConfigurationBrandingSharedInput shared;

    /**
     * The Heading Level 1 customizations.
     */
    private CheckoutAndAccountsConfigurationBrandingHeadingLevelInput headingLevel1;

    /**
     * The Heading Level 2 customizations.
     */
    private CheckoutAndAccountsConfigurationBrandingHeadingLevelInput headingLevel2;

    /**
     * The Heading Level 3 customizations.
     */
    private CheckoutAndAccountsConfigurationBrandingHeadingLevelInput headingLevel3;

    /**
     * The merchandise thumbnails customizations.
     */
    private CheckoutAndAccountsConfigurationBrandingMerchandiseThumbnailInput merchandiseThumbnail;

    /**
     * The primary buttons customizations.
     */
    private CheckoutAndAccountsConfigurationBrandingButtonInput primaryButton;

    /**
     * The secondary buttons customizations.
     */
    private CheckoutAndAccountsConfigurationBrandingButtonInput secondaryButton;

    /**
     * The selects customizations.
     */
    private CheckoutAndAccountsConfigurationBrandingSelectInput select;

    /**
     * The text fields customizations.
     */
    private CheckoutAndAccountsConfigurationBrandingTextFieldInput textField;

    /**
     * The main area customizations.
     */
    private CheckoutAndAccountsConfigurationBrandingMainInput main;

    /**
     * The footer customizations.
     */
    private CheckoutAndAccountsConfigurationBrandingFooterInput footer;

    /**
     * The header customizations.
     */
    private CheckoutAndAccountsConfigurationBrandingHeaderInput header;

    public CheckoutAndAccountsConfigurationBrandingComponentsInput build() {
      CheckoutAndAccountsConfigurationBrandingComponentsInput result = new CheckoutAndAccountsConfigurationBrandingComponentsInput();
      result.checkbox = this.checkbox;
      result.choiceList = this.choiceList;
      result.control = this.control;
      result.divider = this.divider;
      result.favicon = this.favicon;
      result.shared = this.shared;
      result.headingLevel1 = this.headingLevel1;
      result.headingLevel2 = this.headingLevel2;
      result.headingLevel3 = this.headingLevel3;
      result.merchandiseThumbnail = this.merchandiseThumbnail;
      result.primaryButton = this.primaryButton;
      result.secondaryButton = this.secondaryButton;
      result.select = this.select;
      result.textField = this.textField;
      result.main = this.main;
      result.footer = this.footer;
      result.header = this.header;
      return result;
    }

    /**
     * The checkboxes customizations.
     */
    public Builder checkbox(CheckoutAndAccountsConfigurationBrandingCheckboxInput checkbox) {
      this.checkbox = checkbox;
      return this;
    }

    /**
     * The choice list customizations.
     */
    public Builder choiceList(CheckoutAndAccountsConfigurationBrandingChoiceListInput choiceList) {
      this.choiceList = choiceList;
      return this;
    }

    /**
     * The form controls customizations.
     */
    public Builder control(CheckoutAndAccountsConfigurationBrandingControlInput control) {
      this.control = control;
      return this;
    }

    /**
     * The divider customizations.
     */
    public Builder divider(CheckoutAndAccountsConfigurationBrandingDividerStyleInput divider) {
      this.divider = divider;
      return this;
    }

    /**
     * The favicon.
     */
    public Builder favicon(CheckoutAndAccountsConfigurationBrandingImageInput favicon) {
      this.favicon = favicon;
      return this;
    }

    /**
     * The shared customizations.
     */
    public Builder shared(CheckoutAndAccountsConfigurationBrandingSharedInput shared) {
      this.shared = shared;
      return this;
    }

    /**
     * The Heading Level 1 customizations.
     */
    public Builder headingLevel1(
        CheckoutAndAccountsConfigurationBrandingHeadingLevelInput headingLevel1) {
      this.headingLevel1 = headingLevel1;
      return this;
    }

    /**
     * The Heading Level 2 customizations.
     */
    public Builder headingLevel2(
        CheckoutAndAccountsConfigurationBrandingHeadingLevelInput headingLevel2) {
      this.headingLevel2 = headingLevel2;
      return this;
    }

    /**
     * The Heading Level 3 customizations.
     */
    public Builder headingLevel3(
        CheckoutAndAccountsConfigurationBrandingHeadingLevelInput headingLevel3) {
      this.headingLevel3 = headingLevel3;
      return this;
    }

    /**
     * The merchandise thumbnails customizations.
     */
    public Builder merchandiseThumbnail(
        CheckoutAndAccountsConfigurationBrandingMerchandiseThumbnailInput merchandiseThumbnail) {
      this.merchandiseThumbnail = merchandiseThumbnail;
      return this;
    }

    /**
     * The primary buttons customizations.
     */
    public Builder primaryButton(
        CheckoutAndAccountsConfigurationBrandingButtonInput primaryButton) {
      this.primaryButton = primaryButton;
      return this;
    }

    /**
     * The secondary buttons customizations.
     */
    public Builder secondaryButton(
        CheckoutAndAccountsConfigurationBrandingButtonInput secondaryButton) {
      this.secondaryButton = secondaryButton;
      return this;
    }

    /**
     * The selects customizations.
     */
    public Builder select(CheckoutAndAccountsConfigurationBrandingSelectInput select) {
      this.select = select;
      return this;
    }

    /**
     * The text fields customizations.
     */
    public Builder textField(CheckoutAndAccountsConfigurationBrandingTextFieldInput textField) {
      this.textField = textField;
      return this;
    }

    /**
     * The main area customizations.
     */
    public Builder main(CheckoutAndAccountsConfigurationBrandingMainInput main) {
      this.main = main;
      return this;
    }

    /**
     * The footer customizations.
     */
    public Builder footer(CheckoutAndAccountsConfigurationBrandingFooterInput footer) {
      this.footer = footer;
      return this;
    }

    /**
     * The header customizations.
     */
    public Builder header(CheckoutAndAccountsConfigurationBrandingHeaderInput header) {
      this.header = header;
      return this;
    }
  }
}
