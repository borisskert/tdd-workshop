package tdd_test

import (
	"tdd"

	. "github.com/onsi/ginkgo/v2"
	. "github.com/onsi/gomega"
)

var _ = Describe("Greeting", func() {
	It("Should return Hello World", func() {
		Expect(tdd.Greeting()).To(Equal("Hello, World!"))
	})
})
