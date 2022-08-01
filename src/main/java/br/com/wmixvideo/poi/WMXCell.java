package br.com.wmixvideo.poi;

import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.IndexedColors;

public class WMXCell<T> {

    private T value;
    private final WMXStyle style;
    private String formula, comment, link;
    private int mergedColumns, mergedRows;

    public WMXCell(T value) {
        this.value = value;
        this.style = new WMXStyle();
    }

    public WMXCell<T> withValue(final T value) {
        this.value = value;
        return this;
    }

    public T getValue() {
        return value;
    }

    public WMXStyle getStyle() {
        return style;
    }


    public WMXCell<T> header() {
        return this.withHorizontalAligment(HorizontalAlignment.CENTER).withBackgroundColor(IndexedColors.GREY_80_PERCENT).withFontColor(IndexedColors.WHITE).bold();
    }

    public WMXCell<T> title() {
        return this.withBackgroundColor(IndexedColors.GREY_50_PERCENT).withFontColor(IndexedColors.WHITE).bold();
    }

    public WMXCell<T> subtitle() {
        return this.withBackgroundColor(IndexedColors.GREY_25_PERCENT);
    }

    public WMXCell<T> totalizer() {
        return this.withBorderTop().bold();
    }

    public WMXCell<T> bold() {
        this.style.setFontBold(true);
        return this;
    }

    public WMXCell<T> currency() {
        this.getStyle().setDataFormat("#,##0.00");
        return this;
    }

    public WMXCell<T> withFontFamily(final String fontFamily) {
        this.style.setFont(fontFamily);
        return this;
    }

    public WMXCell<T> withFontColor(final IndexedColors color) {
        this.style.setFontColor(color);
        return this;
    }

    public WMXCell<T> withFontSize(final Short size) {
        this.style.setFontSize(size);
        return this;
    }

    public WMXCell<T> withBackgroundColor(final IndexedColors color) {
        this.style.setBackgroundColor(color);
        return this;
    }

    public WMXCell<T> withBackgroundColorHSSF(final HSSFColor color) {
        this.style.setBackgroundColorHSSF(color);
        return this;
    }

    public WMXCell<T> withComment(final String comment) {
        this.comment = comment;
        return this;
    }

    public String getComment() {
        return comment;
    }

    public WMXCell<T> withMergedColumns(final int size) {
        this.mergedColumns = size;
        return this;
    }

    public int getMergedColumns() {
        return mergedColumns;
    }

    public WMXCell<T> withMergedRows(final int size) {
        this.mergedRows = size;
        return this;
    }

    public int getMergedRows() {
        return mergedRows;
    }

    public WMXCell<T> withDataFormat(final String dataFormat) {
        this.getStyle().setDataFormat(dataFormat);
        return this;
    }

    public WMXCell<T> withDataFormat(final short dataForatBuiltin) {
        this.getStyle().setDataFormatBuiltin(dataForatBuiltin);
        return this;
    }

    public WMXCell<T> withBorder() {
        return this.withBorderTop().withBorderBottom().withBorderLeft().withBorderRight();
    }

    public WMXCell<T> withBorderTop() {
        return this.withBorderTop(BorderStyle.THIN);
    }

    public WMXCell<T> withBorderTop(final BorderStyle style) {
        this.getStyle().setBorderTop(style);
        return this;
    }

    public WMXCell<T> withBorderBottom() {
        return this.withBorderBottom(BorderStyle.THIN);
    }

    public WMXCell<T> withBorderBottom(final BorderStyle style) {
        this.getStyle().setBorderBottom(style);
        return this;
    }

    public WMXCell<T> withBorderLeft() {
        return this.withBorderLeft(BorderStyle.THIN);
    }

    public WMXCell<T> withBorderLeft(final BorderStyle style) {
        this.getStyle().setBorderLeft(style);
        return this;
    }

    public WMXCell<T> withBorderRight() {
        return this.withBorderRight(BorderStyle.THIN);
    }

    public WMXCell<T> withBorderRight(final BorderStyle style) {
        this.getStyle().setBorderRight(style);
        return this;
    }

    public WMXCell<T> withHorizontalAligment(final HorizontalAlignment horizontalAlignment) {
        this.getStyle().setHorizontalAlignment(horizontalAlignment);
        return this;
    }

    public WMXCell<T> withLink(final String link) {
        this.link = link;
        return this;
    }

    public String getLink() {
        return link;
    }

    public WMXCell<T> withFormula(final String formula) {
        this.formula = formula;
        return this;
    }

    public String getFormula() {
        return this.formula;
    }
}
