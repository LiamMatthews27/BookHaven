package ac.za.mycput.domain;

public class Library {

    private String libraryID;
    private String LibraryName;
    private String libraryEmail;
    private String libraryAddress;
    private String libraryPhone;

    protected Library() {}

    private Library(Builder builder) {
        this.libraryID = builder.libraryID;
        this.LibraryName = builder.LibraryName;
        this.libraryEmail = builder.libraryEmail;
        this.libraryAddress = builder.libraryAddress;
        this.libraryPhone = builder.libraryPhone;
    }

    public String getLibraryID() { return libraryID;}

    public String getLibraryName() {
        return LibraryName;
    }

    public String getLibraryEmail() {
        return libraryEmail;
    }

    public String getLibraryAddress() {
        return libraryAddress;
    }

    public String getLibraryPhone() {
        return libraryPhone;
    }

    @Override
    public String toString() {
        return "Library{" +
                "libraryID='" + libraryID + '\'' +
                "LibraryName='" + LibraryName + '\'' +
                ", libraryEmail='" + libraryEmail + '\'' +
                ", libraryAddress='" + libraryAddress + '\'' +
                ", libraryPhone=" + libraryPhone +
                '}';
    }

    public static class Builder {
        private String libraryID;
        private String LibraryName;
        private String libraryEmail;
        private String libraryAddress;
        private String libraryPhone;

        public Builder setLibraryID(String libraryID) {
            this.libraryID = libraryID;
            return this;
        }
        public Builder setLibraryName(String libraryName) {
            LibraryName = libraryName;
            return this;
        }

        public Builder setLibraryEmail(String libraryEmail) {
            this.libraryEmail = libraryEmail;
            return this;
        }

        public Builder setLibraryAddress(String libraryAddress) {
            this.libraryAddress = libraryAddress;
            return this;
        }

        public Builder setLibraryPhone(String libraryPhone) {
            this.libraryPhone = libraryPhone;
            return this;
        }

        public Builder copy(Library library) {

            libraryID = library.getLibraryID();
            LibraryName = library.getLibraryName();
            libraryEmail = library.getLibraryEmail();
            libraryAddress = library.getLibraryAddress();
            libraryPhone = library.getLibraryPhone();
            return this;
        }

        public Library build() {
            return new Library(this);
        }
    }
}
