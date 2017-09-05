window.org_vaadin_addons_BookPreview = function () {
    var state = this.getState();

    var self = this;

    google.books.load();

    google.books.setOnLoadCallback(function() {
        var viewer = new google.books.DefaultViewer(self.getElement());
        viewer.load('ISBN:' + state.isbn);
    });

}