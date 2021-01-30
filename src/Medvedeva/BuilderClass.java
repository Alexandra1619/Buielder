package Medvedeva;

public class BuilderClass {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;

    private BuilderClass(Builder builder, int a, int b, int c, int d, int e, int f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }


    public static class Builder {

        public int a;
        public int b;

        public int c = 0;
        public int d = 0;
        public int e = 0;
        public int f = 0;


        public Builder(int a, int b) {
            this.a = a;
            this.b = b;
        }


        public Builder c(int val) {
            c = val;
            return this;
        }

        public Builder d(int val) {
            d = val;
            return this;
        }

        public Builder e(int val) {
            e = val;
            return this;
        }

        public Builder f(int val) {
            f = val;
            return this;
        }

        
        public BuilderClass buidl() {
            return new BuilderClass(this, a, b, c, d, e, f);
        }

        private void BuilderClass(Builder builder) {
            a = builder.a;
            b = builder.b;
            c = builder.c;
            d = builder.d;
            e = builder.e;
            f = builder.f;
        }
    }}
