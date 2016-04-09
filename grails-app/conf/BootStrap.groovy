import pl.reg0.grailsrecruitmenttask.Author
import pl.reg0.grailsrecruitmenttask.BlogEntry
import pl.reg0.grailsrecruitmenttask.EntryStatus

class BootStrap {

    def init = { servletContext ->
        Author a = new Author(name: "John").save()
        Author a2 = new Author(name: "Kate").save()

        a.addToEntries(new BlogEntry(author: a, title: "Hello world!", contents: "This is my first blog post", status: EntryStatus.PUBLISHED).save())
        a2.addToEntries(new BlogEntry(author: a2, title: "Hello kitty!", contents: "This is my first blog post about cats", status: EntryStatus.PUBLISHED).save())
        a.addToEntries(new BlogEntry(author: a, title: "Working hard", contents: "Today I'm working hard, but nothing nice to write about", status: EntryStatus.PUBLISHED).save())
        a2.addToEntries(new BlogEntry(author: a2, title: "A beautiful kitten", contents: "Oh, what a cute little kitten", status: EntryStatus.DRAFT).save())
        a2.addToEntries(new BlogEntry(author: a2, title: "Cat's life", contents: "I observe my cat's life, and it's really nice and full of chill out", status: EntryStatus.PUBLISHED).save())
        a.addToEntries(new BlogEntry(author: a, title: "Private post", contents: "Very sad day, I don't want to share it publicly", status: EntryStatus.UNPUBLISHED).save())
        a.addToEntries(new BlogEntry(author: a, title: "A beautiful day", contents: "It's a beautiful day, I will write more about it later", status: EntryStatus.DRAFT).save())
    }
    def destroy = {
    }
}
