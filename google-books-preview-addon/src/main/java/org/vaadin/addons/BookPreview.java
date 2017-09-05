package org.vaadin.addons;

import com.vaadin.annotations.JavaScript;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.AbstractJavaScriptComponent;

import org.vaadin.addons.client.BookPreviewState;

import java.math.BigInteger;
import java.util.Objects;

@JavaScript({"https://www.google.com/books/jsapi.js", "connector.js"})
public class BookPreview extends AbstractJavaScriptComponent {

    public BookPreview(String isbn){
        Objects.requireNonNull(isbn);
        getState().language = VaadinRequest.getCurrent().getLocale().getCountry();
        getState().isbn = isbn;
    }

    public BookPreview(BigInteger isbn) {
        this(String.format("%064X", Objects.requireNonNull(isbn)));
    }

    @Override
    protected BookPreviewState getState() {
        return (BookPreviewState) super.getState();
    }
}
