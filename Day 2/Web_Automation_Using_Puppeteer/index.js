const puppeteer = require('puppeteer');

(async () => {
  const browser = await puppeteer.launch();
  const page = await browser.newPage();
  await page.goto('https://www.iplt20.com/');
  await page.screenshot({path: 'iplt20.png'});

  const headingResult = await page.evaluate(()=> {
    let nodeListData = document.querySelectorAll(".video-item__heading");
    let nodeListArray = [...nodeListData];

    return nodeListArray.map(h1 => h1.innerText);
  })

  console.log(headingResult);

  await browser.close();
})();