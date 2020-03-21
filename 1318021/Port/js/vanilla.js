const spans = document.querySelectorAll('h1 span')
spans.forEach(span => span.addEventListener('mouseover',function(e){
    span.classList.add('animated','rubberBand')
}))

spans.forEach(span => span.addEventListener('mouseout', function(e){
    span.classList.remove('animated', 'rubberBand')
}))

const htmlbar = document.querySelector('.bar-html')
const cssbar = document.querySelector('.bar-css')
const jsbar = document.querySelector('.bar-js')
const sqlbar = document.querySelector('.bar-sql')
const java = document.querySelector('.bar-java')

var t1 = new TimelineLite()

t1.fromTo(htmlbar, .75, {width: 'calc(0%-6px)'}, {width: 'calc(90% - 6px)', ease:power4.easeOut})
    .fromTo(cssbar, .75,{width: 'calc(0%-6px)'}, {width: 'calc(90%-6px)', ease:power4.easeOut})
    .fromTo(jsbar, .75,{width: 'calc(0%-6px)'}, {width: 'calc(90%-6px)', ease:power4.easeOut})
    .fromTo(sqlbar, .75,{width: 'calc(0%-6px)'}, {width: 'calc(90%-6px)', ease:power4.easeOut})
    .fromTo(javabar, .75,{width: 'calc(0%-6px)'}, {width: 'calc(90%-6px)', ease:power4.easeOut})

const contoller = new ScrollMagic.Controller()
const scene = new ScrollMagic.Scene({
    triggerElement:'.skills',
    triggerHook: 0
})

.setTween(t1)
    .addTo(contoller)