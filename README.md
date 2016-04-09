# grails-recruitment-task
A couple of simple tasks for recruitment of full-stack Grails developer

## tasks
* in EntryService class there is a piece of code
```
List entries = BlogEntry.list().findAll {
    it.contents.contains(filter) || it.title.contains(filter) || it.author.name.contains(filter)
}
```
Please make your opinion about it's performance, how many database queries it'd make and what (if anything) can be optimized here?

* in EntryService class there is a piece of code
```
notifyAuthors(entries*.author, subject, contentClosure)
```
How would you avoid duplicating authors keeping the code as simple as possible?

* in EntryService class, there is a method called "notifyAuthors", what are advantages of using closure here?
how it works? why couldn't or shouldn't we call message(code: '...') here in service?

* in index.gsp file, there is an input tag with "required" attribute. It doesn't work properly in Safari web browser.
Please suggest a solution of that problem in any way so that the form cannot be posted until the field is filled.